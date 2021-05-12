package com.ojas.Poc2.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ojas.Poc2.Domain.Message;
import com.ojas.Poc2.Domain.Orders;
import com.ojas.Poc2.Domain.Products;
import com.ojas.Poc2.Service.ProductAndOrderService;

@RestController
@RequestMapping("/rest")
public class ProductAndOrder {

	@Autowired
	private ProductAndOrderService service;

	@PostMapping("/product/create")
	public Products createProduct(@RequestBody Products product) {
		return service.createProduct(product);
	}

	@GetMapping("/product/list")
	public Iterable<Products> getProducts() {
		return service.getProducts();
	}

	@PostMapping("/order/create")
	public Orders createOrder(@RequestBody Orders order) {
		return service.createOrder(order);
	}

	@GetMapping("/orders/list")
	public Iterable<Orders> getOrders() {
		return service.getOrders();
	}

	@GetMapping("/product/get")
	public Optional<Products> getProduct(@RequestParam("id") Integer id) {
		return service.getproduct(id);
	}

	@GetMapping("/order/get")
	public Optional<Orders> getOrder(@RequestParam("id") Integer id) {
		return service.getOrder(id);
	}

	@GetMapping("/order/place")
	public Message placeOrder(@RequestParam("product_id") Integer id, @RequestParam("quantity") Integer quantity) {
		Message msg = new Message();
		try {
			Orders order = new Orders();
			int code = service.placeOrder(id, quantity, order);
			if (code == 0) {
				msg.setCode(0);
				msg.setMessage("Success");
			} else  {
				msg.setCode(1);
				msg.setMessage("Invalid");
			}
			return msg;
		} catch (Exception e) {
			return msg;
		}
	}

	@GetMapping("/order/update")
	public Message updateOrder(@RequestParam("id") Integer id, @RequestParam("quantity") Integer quantity) {
		Message msg = getMsgObj();
		try {
			int code = service.updateOrder(id, quantity);
			if (code == 0) {
				msg.setCode(0);
				msg.setMessage("Success");
			} else if (code == 1) {
				msg.setCode(1);
				msg.setMessage("Invalid");
			}
			return msg;
		} catch (Exception e) {
			return msg;
		}
	}

	public static Message getMsgObj() {
		return new Message();
	}

}
