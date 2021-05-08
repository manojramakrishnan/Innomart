package com.innovationstack.innomart.exception;

import java.util.List;

import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.util.Constant;

public class ApplicationException extends RuntimeException {

	private RestStatus restStatus;
    private List<Constant.ParamError> data;
    public ApplicationException(RestStatus restStatus) {
        this.restStatus = restStatus;
    }

    public ApplicationException(RestStatus restStatus, List<Constant.ParamError> data) {
        this(restStatus);
        this.data = data;
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public RestStatus getRestStatus() {
        return restStatus;
    }

    public List<Constant.ParamError> getData() {
        return data;
    }

}
