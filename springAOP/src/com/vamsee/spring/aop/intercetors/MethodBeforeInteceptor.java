package com.vamsee.spring.aop.intercetors;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;


public class MethodBeforeInteceptor implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("My Name is : MethodBeforeInterceptor");
		System.out.println(" Class Name");
		System.out.println(arg2.getClass().getName());
		System.out.println(" Method Name");
		System.out.println(arg0.getName());
		System.out.println(" Method Arguments");
		System.out.println(Arrays.toString(arg1));
		System.out.println(" I am done: MethodBeforeInterceptor");
		
		
		
		
		
	}

}
