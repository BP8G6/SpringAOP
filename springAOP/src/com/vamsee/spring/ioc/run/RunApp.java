package com.vamsee.spring.ioc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamsee.spring.ioc.service.GenericService;

public class RunApp {
	public static void main(String... args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans2.xml");
		
		GenericService gs = (GenericService) ctx.getBean("genericService123");
		
	System.out.println("########################### START ##############################################");
		
//	gs.getSpecificNewsById();
//	gs.getEveryNews();
//	gs.getExceptionalNews();
	Object obj = gs.getSpecificNewsById();
	System.out.println("Printing in my main function which is my RunApp");
	System.out.println(obj);
	
	
	
		
		
		
		
	System.out.println("########################### END ##############################################");
	}
}
