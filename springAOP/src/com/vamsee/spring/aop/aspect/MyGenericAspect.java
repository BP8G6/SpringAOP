package com.vamsee.spring.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyGenericAspect {
/*
	@Before(value="execution (* com.vamsee.spring..*.*(..))")
	public void doSomethingForMeBefore(JoinPoint joinPoint){
		System.out.println(" I am the Aspectj Interceptor and  you can call me as MyBeforeAspect");
		
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		
		System.out.println(" I am done with My job now you do yours. donot consume more heap memory!..");
		
	}
	
	
	@After(value="execution (* com.vamsee.spring..*.*(..))")
	public void doSomethingForMeAfter(JoinPoint joinPoint){
		System.out.println(" I am the Aspectj Interceptor and  you can call me as MyAfterAspect");
		
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		
		System.out.println(" I am done with My job now you do yours. donot consume more heap memory!..");
		
	}
	
	
	@AfterReturning(value="execution (* com.vamsee.spring..*.*(..))",returning="result")
	public void doSomethingForMeAfterReturn(JoinPoint joinPoint,Object result){
		System.out.println(" I am the Aspectj Interceptor and  you can call me as MyAfterReturningAspect");
		 System.out.println(" I am printing the return object");
		System.out.println(result);
		
		System.out.println(" I am done with My job now you do yours. donot consume more heap memory!..");
		
	}
	
	
	@AfterThrowing(value="execution (* com.vamsee.spring..*.*(..))",throwing="error")
	public void doSomethingForMeAfterThrows(JoinPoint joinPoint,Throwable error){
		System.out.println(" I am the Aspectj Interceptor and  you can call me as MyAfterThrowingAspect");
		 System.out.println(" I am printing the error/exception");
		System.out.println(error.getMessage());
		
		
	}
	
	*/
	
	
	@Around(value="execution (* com.vamsee.spring..*.*(..))")
	public Object doSomethingForMeAllAround(ProceedingJoinPoint joinPoint){
		System.out.println(" I am the Aspectj Interceptor and  you can call me as MyAllAroundAspect");
		System.out.println("#######################################################");
		System.out.println(" Before");
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		System.out.println("#######################################################");
		Object result=null;	
		try{
		result = joinPoint.proceed();
		System.out.println("AfterReturning");
		System.out.println(" I am printing the return object");
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(result);
		}catch(Throwable ex){
			System.out.println(" throws catch");
			System.out.println(ex.getMessage());
		}
		return result;
		
		
		
		
	}
	
	
	
	
	
	
	

}
