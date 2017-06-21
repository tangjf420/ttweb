package com.tangjf.dto;

import java.io.Serializable;

public class User implements Serializable {
    /** ID */
    private Integer id;

    /** 姓名 */
    private String name;

    /** 我是个下划线测试字段 */
    private String test_aaa;

    /** 年龄 */
    private Integer age;

    /** 测试AA */
    private String testName;

    private static final long serialVersionUID = 1L;

    /**
     * 鑾峰彇 ID
     * 
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 璁惧畾 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 鑾峰彇 姓名
     * 
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 璁惧畾 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 鑾峰彇 我是个下划线测试字段
     * 
     * @return 我是个下划线测试字段
     */
    public String getTest_aaa() {
        return test_aaa;
    }

    /**
     * 璁惧畾 我是个下划线测试字段
     */
    public void setTest_aaa(String test_aaa) {
        this.test_aaa = test_aaa;
    }

    /**
     * 鑾峰彇 年龄
     * 
     * @return 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 璁惧畾 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 鑾峰彇 测试AA
     * 
     * @return 测试AA
     */
    public String getTestName() {
        return testName;
    }

    /**
     * 璁惧畾 测试AA
     */
    public void setTestName(String testName) {
        this.testName = testName;
    }
}