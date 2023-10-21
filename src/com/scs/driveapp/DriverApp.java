package com.scs.driveapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scs.entity.Engine;
import com.scs.entity.MusicSystem;

public class DriverApp {

	public static void main(String[] args) {
		//Resource res=new ClassPathResource("resources/myscsconfigbean.xml");
		//BeanFactory factory=new XmlBeanFactory(res);
		//Engine engine1=(Engine)factory.getBean("e2");
//		System.out.println(engine1.getEno());
//		System.out.println(engine1.getEtype());
//		System.out.println(engine1.getCapacity());
		 
		ApplicationContext factory2=new ClassPathXmlApplicationContext("resources/myscsconfigbean.xml");
//		Engine engine1=(Engine)factory2.getBean("e2");
//		System.out.println(engine1.getEno());
//		System.out.println(engine1.getEtype());
//		System.out.println(engine1.getCapacity());
		
		MusicSystem ms=(MusicSystem)factory2.getBean("ms1");
		System.out.println(ms);		

	}

}
