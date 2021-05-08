package com.innovationstack.innomart.api.user;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.request.model.UserRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.exception.ApplicationException;
import com.innovationstack.innomart.model.Address;
import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.service.UserAddressService;
import com.innovationstack.innomart.service.UserService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Users)
public class UserRest extends AbstractBaseController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserAddressService userAddressService;
	@RequestMapping(path=Mappings.USER_REGISTER,method=RequestMethod.POST, produces=Mappings.CHARSET)
	public ResponseEntity<RestResponse> register (@PathVariable Long companyId, @RequestBody UserRM user){
	Users existingUser= userService.getUserByEmail(user.getEmail(),companyId, Constant.STATUS.ACTIVE_STATUS.getValue());	
	if (existingUser == null) {
		String email= user.getEmail();
		if(email != null && !email.equals("")) {
			Pattern pattern= Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if(!matcher.matches()) {
				throw new ApplicationException(RestStatus.ERR_INVALID_DATA);
			
			}
			Users signUp= new Users();
			System.err.println("CompanyId:: "+companyId);
			signUp.setCompanyId(companyId);
			signUp.setEmail(user.getEmail());
			signUp.setFirstName(user.getFirstName());
			signUp.setLastName(user.getLastName());
			signUp.setMiddleName(user.getMiddleName());
//			signUp.setSalt(UniqueID.getUUID());
			signUp.setStatus(Constant.USER_STATUS.ACTIVE.getStatus());
			signUp.setPasswordHash(user.getPassword());
			signUp.setGroupId(user.getGroupId());
			signUp.setRoleId(Constant.USER_ROLE.NORMAL_USER.getRoleId());
			signUp.setCreateDate(new Date());
			Users usersadd = userService.save(signUp);
			Address address =new Address();
			address.setAddress(user.getAddress());
			address.setCity(user.getCity());
			address.setCountry(user.getCountry());
			address.setFax(user.getFax());
			address.setPhone(user.getPhone());
			address.setUserId(usersadd.getId());
			userAddressService.save(address);
			return responseUtil.successResponse(signUp);
			
			
		} 
		else {
			throw new ApplicationException(RestStatus.ERR_INVALID_DATA);
		}
	
	}
	else {
		throw new ApplicationException(RestStatus.USER_ALREADY_EXIST);
	}
	
	}
}
