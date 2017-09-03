package com.dubyatoo.gateway.filters.pre;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SimpleFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);
	

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		HttpServletRequest req = RequestContext.getCurrentContext().getRequest();
		log.info("{} request to {}", req.getMethod(), req.getRequestURL().toString());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
