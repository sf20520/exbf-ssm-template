package cn.exbf.service.base;


import cn.exbf.dao.base.Mapper;
import cn.exbf.entity.base.BaseEntity;

import java.util.List;

/**
 * 描述:
 * 公用service接口
 *
 * @author ShenFang
 * @create 2017-12-22 13:32
 */
public interface IBaseService<T extends BaseEntity> {
    /**
     * 描述：
     *      获取mapper映射基类对象
     * @return  cn.exbf.dao.base.Mapper<T>
     * @author  ShenFang
     * @date    2017/12/26 13:48
     */
    Mapper<T> getMapper();

    /**
     * 描述：
     *      插入对象
     * @param	t  实体对象
     * @return  java.lang.Long 是否插入成功(主键ID)
     * @author  ShenFang
     * @date    2017/12/26 13:48
     */
    Long insert(T t);

    /**
     * 描述：
     *      根据主键ID获取对象
     * @param	id 主键ID
     * @return  T 实体对象
     * @author  ShenFang
     * @date    2017/12/26 13:49
     */
    T selectByPrimaryKey(Long id);

    /**
     * 描述：
     *      根据主键ID更新对象
     * @author  ShenFang
     * @date    2017/12/22 15:45
     * @param t  实体对象
     * @return  java.lang.Long
     */
    Long updateByPrimaryKey(T t);

    /**
     * 描述：
     *      根据条件查询实体对象集合
     * @param	t  实体对象
     * @return  java.util.List<T> 实体对象集合
     * @author  ShenFang
     * @date    2017/12/26 13:52
     */
    List<T> queryForList(T t);

    /**
     * 描述：
     *      根据主键删除
     * @param	id 主键ID
     * @return  int
     * @author  ShenFang
     * @date    2017/12/26 13:53
     */
    int deleteByPrimaryKey(Long id);

}
