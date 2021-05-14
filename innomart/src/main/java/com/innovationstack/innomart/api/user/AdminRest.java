package com.innovationstack.innomart.api.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.exception.ApplicationException;
import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.service.AdminService;
import com.innovationstack.innomart.service.UserService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Admin)
public class AdminRest extends AbstractBaseController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(path = Mappings.APPROVE_REGISTERED_USERS, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> approveRegisteredUsers( @PathVariable Long companyId,@RequestParam List<String> userIds) {
		
	
		
		
		for (String userId : userIds) {
			
			Users existingUser = userService.getUserByUserIdAndCompanyIdAndStatus(Integer.parseInt(userId), companyId,
					Constant.USER_STATUS.PENDING.getStatus());				
			if(existingUser != null) {
				
				existingUser.setStatus(Constant.USER_STATUS.ACTIVE.getStatus());
				
				adminService.approve(existingUser);
		}
			else {
				throw new ApplicationException(RestStatus.ERR_BAD_REQUEST);
			
		}
		
			
	
	}
		return responseUtil.successResponse("Existing Users Approved Successfully");
		
	}


	}