package com.ibm.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService { //Spring Beans
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	RestTemplate getTaxesTemplate;
	public String createOrder(Order order) {
		//call getTaxes
		String uriVariables;
		Float response = getTaxesTemplate.getForObject("http://localhost:8080/getTaxes?price={price}", Float.class, order.getPrice());
		System.out.println(response);
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
	}
	public List<Order> getOrder(){
		return orderRepository.findAll();
	}
    public String getOrder(Order order) {
		return "order1";
    }
	public void updateOrder(Order order) {
		orderRepository.save(order);

	}
	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);
	}
	public void deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(orderId);
	}
}
