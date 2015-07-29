package com.vamsee.spring.aop.intercetors;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class MethodAtException implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		
		System.out.println(" My name is : MethodAtException");
		System.out.println(" I am get called at the time of an exception");
		System.out.println("Method Name: "+method.getName());
		System.out.println("Arguments are :"+ Arrays.toString(args));
		System.out.println("target class:"+ target.getClass().getName());
		System.out.println(" here is the exception..");
		System.out.println(ex.getMessage());
		System.out.println("I am done : MethodAtException" );
		
	}
	
}
