package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycle {
	public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansLife.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();//确保正常关闭，并且调用相关的 destroy 方法。
	   }
}
