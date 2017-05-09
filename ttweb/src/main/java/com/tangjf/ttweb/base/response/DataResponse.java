package com.tangjf.ttweb.base.response;

import java.util.List;

import com.tangjf.framework.result.OperationResult;

/**
 * JSON请求返回数据结构
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月9日 上午11:20:38
 * @param <T>
 */
public class DataResponse<T> extends OperationResult {

    private static final long serialVersionUID = 2417717238670788184L;

    /** 单个数据 */
    private T data;

    /** 数据集合 */
    private List<T> datas;

    /**
     * 获取 单个数据
     * 
     * @return 单个数据
     */
    public T getData() {
        return data;
    }

    /**
     * 设定 单个数据
     * 
     * @param data 单个数据
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取 数据集合
     * 
     * @return 数据集合
     */
    public List<T> getDatas() {
        return datas;
    }

    /**
     * 设定 数据集合
     * 
     * @param datas 数据集合
     */
    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

}
