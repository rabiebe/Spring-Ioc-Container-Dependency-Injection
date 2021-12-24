package test;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import dao.IDao;
import metier.IMetier;

public class program {

	public static void main(String[] args) {
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("spring-beans.xml"); IMetier metier =
		 * (IMetier) applicationContext.getBean("metier");
		 * System.out.println(metier.sayHello());
		 */
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext("dao", "metier");
		IMetier metier =
				  (IMetier) applicationContext.getBean("metier");
		System.out.println(metier.sayHello());
		
	}

}
