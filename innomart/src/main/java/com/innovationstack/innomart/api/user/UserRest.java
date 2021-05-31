package com.innovationstack.innomart.api.user;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.email.request.MailRequest;
import com.innovationstack.innomart.api.email.service.EmailService;
import com.innovationstack.innomart.api.request.model.AuthRM;
import com.innovationstack.innomart.api.request.model.UserChangePasswordRM;
import com.innovationstack.innomart.api.request.model.UserRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.api.response.model.UserDetailRM;
import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.auth.service.AuthService;
import com.innovationstack.innomart.exception.ApplicationException;
import com.innovationstack.innomart.model.Address;
import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.model.UsersTokens;
import com.innovationstack.innomart.service.UserAddressService;
import com.innovationstack.innomart.service.UserService;
import com.innovationstack.innomart.service.UserTokenService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Users)
public class UserRest extends AbstractBaseController {
	private static final String String = null;
	@Autowired
	private UserService userService;
	@Autowired
	private UserAddressService userAddressService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private UserTokenService userTokenService;

	@RequestMapping(path = Mappings.USER_REGISTER, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> register(@PathVariable Long companyId, @RequestBody UserRM user) {
		Users existingUser = userService.getUserByEmail(user.getEmail(), companyId,
				Constant.STATUS.ACTIVE_STATUS.getValue());
		if (existingUser == null) {
			String email = user.getEmail();
			if (email != null && !email.equals("")) {
				Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
						Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(email);
				if (!matcher.matches()) {
					throw new ApplicationException(RestStatus.ERR_INVALID_DATA);

				}
				Users signUp = new Users();
				System.err.println("CompanyId:: " + companyId);
				signUp.setCompanyId(companyId);
				signUp.setEmail(user.getEmail());
				signUp.setFirstName(user.getFirstName());
				signUp.setLastName(user.getLastName());
				signUp.setMiddleName(user.getMiddleName());
//			signUp.setSalt(UniqueID.getUUID());
				signUp.setStatus(Constant.USER_STATUS.PENDING.getStatus());
				signUp.setPasswordHash(user.getPassword());
				signUp.setGroupId(user.getGroupId());
			
				signUp.setCreateDate(new Date());
				Address address = new Address();
				address.setAddress(user.getAddress());
				address.setCity(user.getCity());
				address.setCountry(user.getCountry());
				address.setFax(user.getFax());
				address.setPhone(user.getPhone());
				// address.setUserId(usersadd.getId());
				signUp.setAddress(address);
				Users usersadd = userService.save(signUp);
				MailRequest request = new MailRequest();
				request.setFrom("manoj.rgv@gmail.com");
				request.setSubject("Test mail");
				request.setTo(user.getEmail());
				request.setName(user.getFirstName());
				Map<String, Object> model = new HashMap<>();
				model.put("Name", request);
				
				emailService.sendEmail(request, model);
				return responseUtil.successResponse(signUp);

			} else {
				throw new ApplicationException(RestStatus.ERR_INVALID_DATA);
			}

		} else {
			throw new ApplicationException(RestStatus.USER_ALREADY_EXIST);
		}

	}

	@RequestMapping(path = Mappings.USER_LIST, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getUserList(HttpServletRequest request, @PathVariable Long companyId) {
		try {
			// String userId= getAuthUserFromSession(request).getId();
			Users users = userService.doFilterSearchSortPagingUser(companyId);
			return responseUtil.successResponse(users);
		} catch (Exception e) {
			throw new ApplicationException(RestStatus.ERR_GET_LIST_USERS);
		}
	}

	@RequestMapping(path = Mappings.USER_DETAILS, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getUserDetails(@PathVariable Long companyId, @PathVariable int userId) {
		Users existingUser = userService.getUserByUserIdAndCompanyIdAndStatus(userId, companyId,
				Constant.USER_STATUS.ACTIVE.getStatus());
		if (existingUser != null) {
			Address address = userAddressService.getAddressByUserIdAndStatus(userId);
			if (address != null) {
				UserDetailRM response = new UserDetailRM();
				response.setCompanyId(companyId);
				response.setUserId(userId);
				response.setRoleId(existingUser.getRole().getId());
				response.setFirstName(existingUser.getFirstName());
				response.setMiddleName(existingUser.getMiddleName());
				response.setLastName(existingUser.getLastName());
				response.setEmail(existingUser.getEmail());
				response.setCreateDate(existingUser.getCreateDate());
				response.setPhone(address.getPhone());
				response.setFax(address.getFax());
				response.setAddress(address.getAddress());
				response.setCity(address.getCity());
				response.setCountry(address.getCountry());
				return responseUtil.successResponse(response);
			} else {
				throw new ApplicationException(RestStatus.ERR_USER_NOT_FOUND);
			}

		} else {
			throw new ApplicationException(RestStatus.ERR_USER_NOT_FOUND);
		}

	}

	@RequestMapping(path = Mappings.UPDATE_USER, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> updateUser(@PathVariable Long companyId, @RequestBody UserRM user) {
		Users existingUser = userService.getUserByUserIdAndCompanyIdAndStatus(Integer.parseInt(user.getUserId()),
				companyId, Constant.USER_STATUS.ACTIVE.getStatus());
		if (existingUser != null) {
			existingUser.setFirstName(user.getFirstName());
			existingUser.setMiddleName(user.getMiddleName());
			existingUser.setLastName(user.getLastName());

			Address address = userAddressService.getAddressByUserIdAndStatus(Integer.parseInt(user.getUserId()));
			if (address != null) {
				address.setAddress(user.getAddress());
				address.setCity(user.getCity());
				address.setCountry(user.getCountry());
				address.setFax(user.getFax());
				address.setPhone(user.getPhone());
			} else {
				throw new ApplicationException(RestStatus.ERR_USER_ADDRESS_NOT_FOUND);
			}

			existingUser.setAddress(address);
			userService.save(existingUser);

			return responseUtil.successResponse(existingUser);

		} else {
			throw new ApplicationException(RestStatus.ERR_USER_NOT_FOUND);
		}

	}

	@RequestMapping(path = Mappings.DELETE_USER, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> deleteUser( @PathVariable Long companyId,@RequestParam List<String> userIds  ) {
		
		if(userIds != null && userIds.size() > 0) {
			for (String userId : userIds) {
				System.err.println("UserId ::: "+userId);
				Users existingUser = userService.getUserByUserIdAndCompanyIdAndStatus(Integer.parseInt(userId), companyId,
						Constant.USER_STATUS.ACTIVE.getStatus());		
			if(existingUser != null) {
				
				existingUser.setStatus(Constant.USER_STATUS.INACTIVE.getStatus());
				System.err.println("status :: "+existingUser.getStatus());
				userService.delete(existingUser);
			}
			
			}
			return responseUtil.successResponse("Deleted Users Successfully");
		
		
		
		
		
		
	}
	else {
		throw new ApplicationException(RestStatus.ERR_BAD_REQUEST);
	
	}
	}
	
	@RequestMapping(value = Mappings.USERS_LOGIN, method = RequestMethod.POST, produces = Mappings.CHARSET)
    public ResponseEntity<RestResponse> login(
            @PathVariable Long companyId,
            @RequestBody AuthRM auth
    ) {
		
		if ("".equals(auth.getUsername()) || "".equals(auth.getPassword())) {
            // invalid paramaters
            throw new ApplicationException(RestStatus.INVALID_PARAMETER);
        } 
		else {
            Users userLogin = userService.getUserByEmail(auth.getUsername(), companyId, Constant.USER_STATUS.ACTIVE.getStatus());

            if (userLogin != null) {


                if (bCryptPasswordEncoder.matches(auth.getPassword(), userLogin.getPasswordHash()) ){
                    UsersTokens userToken = authService.createUserToken(userLogin, auth.isKeepMeLogin());
                    // Create Auth User -> Set to filter config
                    // Perform the security
                    Authentication authentication = new UsernamePasswordAuthenticationToken(
                            userLogin.getEmail(),
                            userLogin.getPasswordHash()
                    );
                    //final Authentication authentication = authenticationManager.authenticate();
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                    return responseUtil.successResponse(userToken.getToken());
                } else {
                    // wrong password
                    throw new ApplicationException(RestStatus.ERR_USER_NOT_VALID);
                }

            } else {
                // can't find user by email address in database
                throw new ApplicationException(RestStatus.ERR_USER_NOT_EXIST);
            }
        }
		
	}
	@RequestMapping(path = Mappings.USERS_LOGOUT, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> logout( @PathVariable Long companyId, HttpServletRequest request  ) {
		
		String AuthToken = request.getHeader(Constant.HEADER_TOKEN);
		UsersTokens usersTokens = userTokenService.getTokenID(AuthToken);
		if (usersTokens !=null) {
			userTokenService.invalidateToken(usersTokens);
	       return responseUtil.successResponse(RestStatus.OK);
		}
		
		else {
			throw new ApplicationException(RestStatus.ERR_UNAUTHORIZED);
		
		}
	}

		
	
	@RequestMapping(path = Mappings.CHANGE_PASSWORD_USER, method = RequestMethod.POST, produces = Mappings.CHARSET)	
	public ResponseEntity<RestResponse> changeUserPassword(@PathVariable Long companyId, @RequestBody UserChangePasswordRM user){
		Users existingUser = userService.getUserByUserIdAndCompanyIdAndStatus(user.getId(),companyId,
			 Constant.USER_STATUS.ACTIVE.getStatus());
		if(existingUser != null) {
			String OldPassword=user.getOldPassword();
			System.err.println("first if");
			
		
		if(bCryptPasswordEncoder.matches(OldPassword, existingUser.getPasswordHash())) {
			
			System.err.println("second if");
			
			if(user.getNewPassword() != null || !user.getNewPassword().isEmpty()) {
				
				System.err.println("third if");
				
			existingUser.setPasswordHash(bCryptPasswordEncoder.encode(user.getNewPassword()));
			userService.updatePassword(existingUser);
			return responseUtil.successResponse(existingUser);	
			
			}
			else {
				throw new ApplicationException(RestStatus.ERR_UNCORRECT_PASSWORD);
				
			}
			
			}
		else {
			throw new ApplicationException(RestStatus.ERR_MISSING_PASSWORD);
		}
		
		}
		else {
			throw new ApplicationException(RestStatus.ERR_USER_NOT_FOUND);
		}
	
	}	
	

}
	
	
	
	
	
