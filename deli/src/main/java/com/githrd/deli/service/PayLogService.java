package com.githrd.deli.service;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.ModelAndView;

import com.githrd.deli.vo.PayVO;

@Service
@Aspect
public class PayLogService {
	private static Logger payLog = LoggerFactory.getLogger("payLog");
	
	@Autowired
	PayVO paVO;
	
	
	
	
}
