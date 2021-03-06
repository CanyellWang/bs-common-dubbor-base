package com.gomeplus.bs.framework.dubbor.exceptions.code4xx;


import com.gomeplus.bs.framework.dubbor.exceptions.RESTfull4xxBaseException;

import java.io.Serializable;

/**
 * @Description 405异常 ，Forbidden：服务器已经理解请求，但是拒绝执行它
 * @author wanggang-ds6
 * @date 2016年1月21日 下午1:51:17
 */
public class C405Exception extends RESTfull4xxBaseException implements Serializable {

	private static final long serialVersionUID = -779530377325082078L;

	public C405Exception(String message) {
		super(message);
	}
}