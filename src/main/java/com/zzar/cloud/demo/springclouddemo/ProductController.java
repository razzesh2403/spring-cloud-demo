package com.zzar.cloud.demo.springclouddemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	 
	@ApiOperation(value = "print greeting message", response = Iterable.class)
	 @GetMapping("/greeting")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting";
	    }
	 
	 @GetMapping("/products")
	    public String products(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("prodList", productRepository.findAll());
	        return "products";
	    }
	 
	 @ApiOperation(value = "View a list of available products in Json format", response = Iterable.class)
	 @GetMapping("/productsJson")
	    public @ResponseBody List<Product> productsJson() {
	        List<Product> products = productRepository.findAll();
	        return products;
	    }
	 
	 @GetMapping("/addProduct")
	    public String addProductForm(Model model) {
	        model.addAttribute("prod", new Product());
	        return "addProduct";
	    }
	 
	 @PostMapping("/addProductSubmit")
	    public String addProductSubmit(@ModelAttribute Product prod) {
		 	prod.setId(productRepository.findAll().size()+1);
		 	productRepository.save(prod);
	        return "products";
	    }
}
