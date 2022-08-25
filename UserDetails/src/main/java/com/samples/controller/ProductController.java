package com.samples.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.samples.dao.ProductDao;
import com.samples.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao dao;
	
	
	
	private Logger logger = Logger.getLogger(ProductController.class);
	
	@GetMapping("/productid")
	public String getProduct(HttpServletRequest request,ModelMap map, HttpServletResponse response) {
		long id=Long.parseLong(request.getParameter("id"));	
		if(id>0)
		{
			Product product=dao.getProductById(id);
	        logger.info(product);
			map.addAttribute("obj",product);
			return "details";
		}
		else
		{
			try {
				try {
					request.getRequestDispatcher("/index.jsp").include(request, response);
					response.setContentType("text/html");
					PrintWriter out = response.getWriter();
					out.println("Oops!!Invalid Credentials:)");				
					
				} catch (ServletException e) {
					e.printStackTrace();
				}
				
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	@GetMapping("/update")
	public String updateProduct(HttpServletRequest request,ModelMap map) {
		long id=Long.parseLong(request.getParameter("id"));
		String name=request.getParameter("name");
		BigDecimal price = new BigDecimal(request.getParameter("price"));
 {
			Product product= new Product();
			product.setId(id);
			product.setName(name);
			product.setPrice(price);
			dao.updateProduct(product);
			map.addAttribute("obj",product);
			return "details";
			
		} 

	}

}
