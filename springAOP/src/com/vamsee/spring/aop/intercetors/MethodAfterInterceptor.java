package com.vamsee.spring.aop.intercetors;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfterInterceptor implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("My Name is : MyMethodAfterInterceptor");
		System.out.println(" Class Name");
		System.out.println(arg3.getClass().getName());
		System.out.println(" Method Name");
		System.out.println(arg1.getName());
		System.out.println(" Method Arguments");
		System.out.println(Arrays.toString(arg2));
		System.out.println(" I have the Return Object... and here is it ");
		System.out.println(arg0);
		System.out.println(" I am done: MyMethodAfterInterceptor");
		
		
		
	}

}
