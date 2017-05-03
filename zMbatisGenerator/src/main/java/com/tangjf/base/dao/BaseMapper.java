package com.tangjf.base.dao;

import java.util.List;

public interface BaseMapper<T> {

    T get(String id);

    List<T> queryList(T bean);

    int insert(T bean);

    int update(T bean);

    int delete(T bean);
}
