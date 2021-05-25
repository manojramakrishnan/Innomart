package com.innovationstack.innomart.api.order;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.request.model.OrderRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.model.Address;
import com.innovationstack.innomart.model.Orders;
import com.innovationstack.innomart.service.OrderService;
import com.innovationstack.innomart.service.UserAddressService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Order)
public class OrderRest extends AbstractBaseController{

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserAddressService userAddressService;

	@RequestMapping(path=Mappings.ADD_ORDER, method = RequestMethod.POST,  produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>addOrder(@PathVariable Long companyId, @RequestBody OrderRM order ) {
		Address address = new Address();
		Date createdDate = new Date();
		if(order.getUser().getUserId() !=null || order.getUser().getUserId().isEmpty() ) {
			
		address.setAddress(order.getUser().getAddress());
		address.setCity(order.getUser().getCity());
		address.setCountry(order.getUser().getCountry());
		address.setFax(order.getUser().getFax());
		address.setPhone(order.getUser().getPhone());
		address.setUserId(Integer.parseInt(order.getUser().getUserId()));
			
		userAddressService.save(address);
		
		}
		else {
			address= userAddressService.getAddressByUserId(order.getUser().getUserId());
		}
		
		Orders orders =new Orders();
		orders.setUserId(order.getUser().getUserId());
		orders.setCustomerFirstname(order.getUser().getFirstName());
		orders.setCustomerMiddlename(order.getUser().getMiddleName());
		orders.setCustomerLastname(order.getUser().getLastName());
		orders.setCompanyId(orders.getCompanyId());
		orders.setCustomerEmail(order.getUser().getEmail());
		orders.setStatus(Constant.ORDER_STATUS.PENDING.getStatus());
		orders.setCreatedAt(createdDate);
		orders.setUpdatedAt(createdDate);
		orderService.save(orders);
		
		return responseUtil.successResponse(orders);


	}
}
