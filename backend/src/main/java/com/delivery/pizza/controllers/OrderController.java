package com.delivery.pizza.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.pizza.dto.OrderDTO;
import com.delivery.pizza.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public OrderDTO insert(@RequestBody OrderDTO orderDTO) {
		return orderService.insert(orderDTO);
	}
	
	@PutMapping("/{id}/delivered")
	public ResponseEntity<OrderDTO> setDelivered(@PathVariable Long id) {
		OrderDTO orderDTO = orderService.setDelivered(id);
		return ResponseEntity.ok().body(orderDTO);
	}
	
}
