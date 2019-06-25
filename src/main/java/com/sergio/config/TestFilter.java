package com.sergio.config;

import java.io.IOException;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(0)
public class TestFilter extends HttpFilter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			System.out.println("pedido");
			chain.doFilter(request, response);
	}
	
}
