package com.sample.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
//@ComponentScan(basePackages= {"com.sample.myapp"}) //어노테이션
//@ImportResource(value= {"classpath:application-config.xml"}) //xml파일
public class Appconfig {

//	@Bean
//	IHelloService helloService() {
//		//빈의 이름이 메서드 이름
//		return new HelloService();
//		//이 코드는 xml에보다 java코드에 익숙한 사람들에게 좋다.
//	}
	//ComponentScan을 사용하는 이유는 기존의 xml파일과 javaconfig파일 두개다 사용할수 있도록 한다.
	//xml에서 사용하는 이름을 이곳에서 사용하면 중복이 되므로 사용하면 안된다.
//	@Autowired
//	IHelloService helloService;
	
	@Bean
	HelloController helloController() {
		HelloController controller = new HelloController();
		return controller; 
	}
}
