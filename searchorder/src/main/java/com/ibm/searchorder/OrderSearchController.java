package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.searchorder.entity.Order;

@RestController

public class OrderSearchController {
	@Autowired // used for DI
	OrderService orderService; // DI
	
	@GetMapping("/order")
	List<Order>getOrder() {
		return orderService.getOrder();
	}
	/**
	 * Learning pull request
	 * */
	/**
	 * method to search for an order
	 * @param orderId
	 * @return zero or matching order
	 */

	@GetMapping("/order/{id}")
	Optional<Order> getOrder(@PathVariable("id") String orderId) {
		return orderService.getOrderById(orderId);
	}


}
