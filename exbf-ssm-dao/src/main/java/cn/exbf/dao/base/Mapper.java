package cn.exbf.dao.base;

import cn.exbf.entity.base.BaseEntity;

import java.util.List;

/**
 * 描述:
 * 公用 mapper 映射基类
 *
 * @author ShenFang
 * @create 2017/12/22 13:34
 */
public interface Mapper<T extends BaseEntity> {

    /**
     * 描述：
     * 获取 mapper 映射基类对象
     *
     * @return dao.cn.exbf.dao.base.Mapper<T>
     * @author ShenFang
     * @date 2017/12/22 16:36
     */
    Mapper<T> getMapper();

    /**
     * 描述：
     * 插入对象
     *
     * @param t 实体对象
     * @return java.lang.Long  是否插入成功
     * @author ShenFang
     * @date 2017/12/22 16:41
     */
    Long insert(T t);

    /**
     * 描述：
     * 根据主键 ID 获取对象
     *
     * @param id 主键 ID
     * @return T   实体对象
     * @author ShenFang
     * @date 2017/12/22 17:09
     */
    T selectByPrimaryKey(Long id);

    /**
     * 描述：
     * 根据主键 ID 更新对象
     *
     * @param t 实体对象
     * @return int     是否更新成功
     * @author ShenFang
     * @date 2017/12/22 17:10
     */
    int updateByPrimaryKey(T t);

    /**
     * 描述：
     * 根据条件查询实体对象集合
     *
     * @param t 实体对象
     * @return java.util.List<T>   实体对象集合
     * @author ShenFang
     * @date 2017/12/22 17:11
     */
    List<T> queryForList(T t);

    /**
     * 描述：
     * 根据主键删除对象
     *
     * @param id 主键 ID
     * @return int 删除结果
     * @author ShenFang
     * @date 2017/12/22 17:12
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 描述：
     * 插入记录
     *
     * @param record 记录
     * @return int     插入结果
     * @author ShenFang
     * @date 2017/12/22 17:13
     */
    int insertSelective(T record);

    /**
     * 描述：
     * 更新记录
     *
     * @param record 记录
     * @return int     更新结果
     * @author ShenFang
     * @date 2017/12/22 17:17
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 描述：
     * 获取下个 Sequence 值
     *
     * @return java.lang.Long  下个 Sequence 值
     * @author ShenFang
     * @date 2017/12/22 17:18
     */
    Long getNextSequenceValue();

}
