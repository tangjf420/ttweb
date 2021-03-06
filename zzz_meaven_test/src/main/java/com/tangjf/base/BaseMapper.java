package com.tangjf.base;

import java.util.List;

public interface BaseMapper<T> {

    T get(Object id);

    List<T> queryList(T bean);

    int insert(T bean);

    int update(T bean);

    int delete(T bean);
}
