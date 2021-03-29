package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.searchorder.entity.Order;
import com.ibm.searchorder.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
  
	public List<Order> getOrder() {
		return orderRepository.findAll();
	}
	public Optional<Order> getOrderById(String orderId) {
		return orderRepository.findById(orderId);
	}
}
