package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		WishBean wishBean = (WishBean)context.getBean("wishBean");
		System.out.println(wishBean.wish());
		
		HelloBean helloBean =  (HelloBean)context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		
		WelcomeBean welcomeBean = (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(welcomeBean.sayWelcome());
	}

}
