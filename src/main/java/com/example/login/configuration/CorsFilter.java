package com.example.login.configuration;


import java.io.IOException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;


	@Component
	@Configuration
	public class CorsFilter implements Filter{

	@Override
	    public void init(FilterConfig fConfig) throws ServletException {
	        // TODO Auto-generated method stub
	    }
	
	    @Override
	    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
	        HttpServletResponse response = (HttpServletResponse) servletResponse;
	        response.setHeader("Access-Control-Allow-Origin", "*");
	        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
	        response.setHeader("Access-Control-Allow-Headers", "Content-type, Authorization");
	        filterChain.doFilter(servletRequest, servletResponse);
	    }

	    @Override
	    public void destroy() {
	        // TODO Auto-generated method stub
	    }

	}



























