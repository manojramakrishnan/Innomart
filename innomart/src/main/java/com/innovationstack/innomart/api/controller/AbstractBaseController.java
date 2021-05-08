package com.innovationstack.innomart.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationstack.innomart.api.response.model.util.ResponseUtil;

public abstract class AbstractBaseController {
	
	@Autowired
    protected ResponseUtil responseUtil;

}
