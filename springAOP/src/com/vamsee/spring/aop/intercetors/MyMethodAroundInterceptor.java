package com.vamsee.spring.aop.intercetors;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAroundInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(" Logging Before..");
		
		 System.out.println("class Name  :  "+arg0.getThis().getClass().getName());
		System.out.println("MethodName : "+arg0.getMethod().getName());
		System.out.println("Arguments :" + Arrays.toString(arg0.getArguments()));
		
		System.out.println(" Now i will be able to RUN the Method....");
		System.out.println(" I will be able to get the return as well..");
		Object result = null;
		try{
		
		 result = arg0.proceed();
		
		}catch(Exception ex){
			System.out.println("Logging at Exception....");
			System.out.println(" caught exception...");
			System.out.println(" exception Name: " + ex.getMessage());
		}
		
		System.out.println(" I am running the Method..ie(The target Method got a run in the JVM Thread)");
		System.out.println(" i want to return anything i want....");
		
		return result;
	}

}
