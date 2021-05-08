package com.innovationstack.innomart.api.response.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.innovationstack.innomart.api.response.model.util.RestStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse<T extends Object> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
    private String message;
    private T data;

    public RestResponse(RestStatus restStatus, T data) {

        if (restStatus == null) {
            throw new IllegalArgumentException("restStatus must not be null");
        }

        this.status = restStatus.getCode();
        this.message = restStatus.getDescription();
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

