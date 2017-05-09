package com.tangjf.framework.dao;

import java.util.List;

/**
 * Dao层基础SQL接口定义
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月3日 下午1:46:53
 * @param <T> 表对象实体
 */
public interface BaseMapper<T> {

    /**
     * 根据主键获得数据
     * 
     * @param id 主键
     * @return 检索结果实体
     */
    T get(String id);

    /**
     * 通过查询条件返回列表数据
     * 
     * @param query 检索对象实体
     * @return 检索结果实体集合
     */
    List<T> queryList(T query);

    /**
     * 插入新数据
     * 
     * @param bean 插入对象实体
     * @return 插入成功条数
     */
    int insert(T bean);

    /**
     * 根据主键更新数据
     * 
     * @param bean 更新对象实体
     * @return 更新成功条数
     */
    int update(T bean);

    /**
     * 根据主键删除数据
     * 
     * @param id 主键
     * @return 删除成功条数
     */
    int delete(String id);
}
