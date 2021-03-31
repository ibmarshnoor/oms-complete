package com.ibm.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

class OrderServiceTest {

	@Test
	void testCreateOrder() {
		OrderService orderService = new OrderService();
		OrderRepository dummyRepo = new DummyOrderRepository();
		orderService.setOrderRepository(dummyRepo);
		Order order = new Order();
		String orderId = orderService.createOrder(order);
		assertNotNull(orderId);
	}

//	@Test
//	void testGetOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetOrderOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetOrderString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteOrder() {
//		fail("Not yet implemented");
//	}
//
}
