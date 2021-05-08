package com.innovationstack.innomart.api.response.model.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.util.Constant;

@Component
public class ResponseUtil {

	private RestResponse _createSSOResponse(RestStatus restStatus, Object data) {
        return new RestResponse(restStatus, data);
    }
	public ResponseEntity<RestResponse> buildResponse(RestStatus restStatus, Object data, HttpStatus httpStatus) {
        return new ResponseEntity(_createSSOResponse(restStatus, data), httpStatus);
    }

    public ResponseEntity<RestResponse> successResponse(Object data) {
        return buildResponse(RestStatus.OK, data, HttpStatus.OK);
    }

    public ResponseEntity<RestResponse> badRequestResponse(List<Constant.ParamError> errors) {

        Map<String, String> errMap = null;

        if (errors != null) {

            errMap = new HashMap<>();
            for (Constant.ParamError error : errors) {
                errMap.put(error.getName(), error.getDesc());
            }
        }

        return buildResponse(RestStatus.ERR_BAD_REQUEST, errMap, HttpStatus.BAD_REQUEST);
    }


}
