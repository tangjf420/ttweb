package com.tangjf.ttweb.response.base;

import java.io.Serializable;

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = -4405852880612183574L;

	private boolean success;
	// 返回码
	private String code;
	// 返回信息
	private String msg;

}
