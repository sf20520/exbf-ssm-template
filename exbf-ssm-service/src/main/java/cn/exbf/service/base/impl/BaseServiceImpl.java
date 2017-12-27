package cn.exbf.service.base.impl;

import cn.exbf.dao.base.Mapper;
import cn.exbf.entity.base.BaseEntity;
import cn.exbf.service.base.IBaseService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 描述:
 * 公用service实现类
 *
 * @author ShenFang
 * @date 2017/12/25 9:57
 */
@SuppressWarnings("unused")
public class BaseServiceImpl<T extends BaseEntity, M extends Mapper<T>> implements IBaseService<T>, ApplicationContextAware {

    /**
     * 实体类
     */
    private Class<T> entityClass;

    /**
     * Mapper实体类
     */
    private Class<M> mapperClass;

    /**
     * Mapper实体对象
     */
    private M baseMapper;

    private ApplicationContext ctx;

    /**
     * 构造方法，主要通过反射获得dao，entity
     */
    public BaseServiceImpl() {
        Type genType = getClass().getGenericSuperclass();
        if (genType instanceof ParameterizedType) {
            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
            if (params[0].getClass().isInstance(BaseEntity.class)) {
                this.entityClass = (Class<T>) params[0];
            }
            if (params[1].getClass().isInstance(Mapper.class)) {
                this.mapperClass = (Class<M>) params[1];
            }
        }
    }

    /**
     * (non-Javadoc)
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(
     * org.springframework.context.ApplicationContext)
     */
    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
        this.baseMapper = (M) ctx.getBean(mapperClass);
    }

    public ApplicationContext getCtx() {
        return ctx;
    }

    @Override
    public M getMapper() {
        return baseMapper;
    }

    @Override
    @Transactional
    public Long insert(T t) {
        Long i = this.getMapper().insert(t);
        if (i == 1) {
            return t.getId();
        }
        return Long.valueOf(i);
    }

    @Override
    public T selectByPrimaryKey(Long id) {
        return (T) this.getMapper().selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public Long updateByPrimaryKey(T t) {
        int i = this.getMapper().updateByPrimaryKey(t);
        if (i == 1) {
            return t.getId();
        }
        return Long.valueOf(i);
    }

    @Override
    public List<T> queryForList(T t) {
        return this.getMapper().queryForList(t);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return this.getMapper().deleteByPrimaryKey(id);
    }

}
