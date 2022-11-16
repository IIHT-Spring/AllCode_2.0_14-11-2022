package com.core.SpringCoreDemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/lifecycle/config.xml");
		Motorbike m1=(Motorbike) context.getBean("motorbike1");
		System.out.println(m1);
		context.registerShutdownHook();
	}

}
