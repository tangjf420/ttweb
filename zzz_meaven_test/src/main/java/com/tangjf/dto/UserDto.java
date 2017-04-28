package com.tangjf.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private static final long serialVersionUID = 794633219340842705L;

	/** ID */
	private Integer id;
	/** 姓名 */
	private String name;
	/** 年龄 */
	private Integer age;

	/**
	 * 获取 ID
	 * 
	 * @return ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设定 ID
	 * 
	 * @param id
	 *            ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取 姓名
	 * 
	 * @return 姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设定 姓名
	 * 
	 * @param name
	 *            姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取 年龄
	 * 
	 * @return 年龄
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * 设定 年龄
	 * 
	 * @param age
	 *            年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

}
