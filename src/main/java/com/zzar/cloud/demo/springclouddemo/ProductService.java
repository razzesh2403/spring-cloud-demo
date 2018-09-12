package com.zzar.cloud.demo.springclouddemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController("/product")
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@ApiOperation(value = "View a list of available products", response = Iterable.class)
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	@ApiOperation(value = "View product by Id", response = Iterable.class)
	@RequestMapping(value = "/getProductById", method = RequestMethod.GET)
	public Product getProductById(@RequestParam int id) {
		return productRepository.findById(id);
	}
	
	@ApiOperation(value = "View product by name", response = Iterable.class)
	@RequestMapping(value = "/getProductByName", method = RequestMethod.GET)
	public Product getProductByName(@RequestParam String name) {
		return productRepository.findByName(name);
	}
	
	@ApiOperation(value = "add new product", response = Iterable.class)
	@RequestMapping(value = "/saveProduct", method = RequestMethod.PUT)
	public void saveProduct(@RequestParam Product prod) {
		productRepository.save(prod);
	}
}
