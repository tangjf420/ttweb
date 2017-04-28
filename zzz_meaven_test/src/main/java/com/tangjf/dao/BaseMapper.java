package com.tangjf.dao;

public interface BaseMapper<T> {

	int insert(T obj);

	int update(T obj);

	T get(Object id);

	<I> int delete(I id);
}
