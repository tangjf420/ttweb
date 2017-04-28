package com.tangjf.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private static final long serialVersionUID = 794633219340842705L;

	/** ID */
	private Integer id;
	/** ���� */
	private String name;
	/** ���� */
	private Integer age;

	/**
	 * ��ȡ ID
	 * 
	 * @return ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * �趨 ID
	 * 
	 * @param id
	 *            ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * ��ȡ ����
	 * 
	 * @return ����
	 */
	public String getName() {
		return name;
	}

	/**
	 * �趨 ����
	 * 
	 * @param name
	 *            ����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ ����
	 * 
	 * @return ����
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * �趨 ����
	 * 
	 * @param age
	 *            ����
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

}
