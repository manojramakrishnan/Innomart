package com.innovationstack.innomart.api.order;

import java.util.Date;
import java.util.List;

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
import com.innovationstack.innomart.model.Categories;
import com.innovationstack.innomart.model.OrderDetail;
import com.innovationstack.innomart.model.Orders;
import com.innovationstack.innomart.model.ProductInfo;
import com.innovationstack.innomart.model.Products;
import com.innovationstack.innomart.service.OrderDetailService;
import com.innovationstack.innomart.service.OrderService;
import com.innovationstack.innomart.service.ProductService;
import com.innovationstack.innomart.service.UserAddressService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Order)
public class OrderRest extends AbstractBaseController{

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserAddressService userAddressService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private OrderDetailService orderDetailService;

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
		String companyIds= companyId.toString();
		orders.setCompanyId(Integer.parseInt(companyIds));
		orders.setCustomerEmail(order.getUser().getEmail());
		orders.setStatus(Constant.ORDER_STATUS.PENDING.getStatus());
		orders.setCreatedAt(createdDate);
		orders.setUpdatedAt(createdDate);
		orders.setBaseGrandTotal(20.0f);
		orders.setBaseSubTotal(10.0f);
		orders.setCheckoutComment("Hi team");
		orders.setCustomerDob(createdDate);
		orders.setCustomerIsGuest(1);
		orders.setCustomerPrefix("Mr");
		orders.setCustomerSuffix("no");
		orders.setGrandTotal(100.0f);
		orders.setIsActive(1);
		orders.setIsChanged(1);
		orders.setIsMultishipping(1);
		orders.setIsVirtual(1);
		orders.setItemsCount(2);
		orders.setItemsQuantity(2.0f);
		orders.setRemoteIp("123.12");
		orders.setStatus(1);
		orders.setSubTotal(12.0f);
		orders.setCustomerGender("Male");
		Orders ord = orderService.save(orders);
		
		if (order.getProductList().size() > 0) {
            for (ProductInfo productInfo : order.getProductList()) {
            	Long pId = (Long)productInfo.getProductId();
            	String productId = pId.toString();
                Products product = productService.getProductById(companyId, Integer.parseInt(productId));
                if (product != null) {
                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setOrderId(orders.getId());
                    orderDetail.setProductId(product.getId());
                    orderDetail.setOrderName(product.getProductName());
                    orderDetail.setPrice(product.getSalePrice().floatValue());
                    String prodquantity = product.getQuantity().toString();
                    orderDetail.setQuantity(Float.parseFloat(prodquantity));
                    orderDetail.setCreatedAt(createdDate);
                    orderDetail.setBasePrice(12.0f);
                    orderDetail.setBaseRowTotal(112.0f);
                    orderDetail.setDescription("test");
                    orderDetail.setIsVirtual(1);
                    orderDetail.setOrderId(ord.getId());
                    orderDetail.setParentId(1);
                    orderDetail.setProductType("sanitary");
                    orderDetail.setRowTotal(200.0f);
                    orderDetail.setRowWeight(10.0f);
                    orderDetail.setSku("sku");
                    orderDetail.setWeight(20.0f);
                    orderDetail.setUpdatedAt(createdDate);
                    orderDetail.setFreeShipping(0);
                    orderDetailService.saveOrUpdate(orderDetail);
                }
            }
        }
		
		return responseUtil.successResponse(orders);


	}

	@RequestMapping(path = Mappings.GET_ORDER_BY_COMPANY_ID, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getOrderByCompanyId(@PathVariable Long companyId) {
	List<Orders>  list= orderService.getOrderByCompanyId(companyId);
		return responseUtil.successResponse(list);
	}
}
