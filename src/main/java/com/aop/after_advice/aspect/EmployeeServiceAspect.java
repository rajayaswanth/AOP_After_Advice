package com.aop.after_advice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	@After(value = "execution(* com.aop.after_advice.service.EmployeeService.*(..)) and args(empId, fname, sname)")  
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("Successfully Created Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);
	}

}
