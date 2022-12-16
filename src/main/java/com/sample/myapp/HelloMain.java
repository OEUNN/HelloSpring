package com.sample.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		//xml일때
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config.xml");
		
		//Appconfig일때
//		AbstractApplicationContext context =
//				new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println("------------------------------------------");
		HelloController helloController = context.getBean(HelloController.class);
		helloController.hello("홍길동");
		System.out.println("------------------------------------------");
		helloController.goodbye("Dan");
		System.out.println("===============================================");
		context.close();
	}

}
