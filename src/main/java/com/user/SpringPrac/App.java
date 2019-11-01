package com.user.SpringPrac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("BeanFile.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("BeanFile.xml");
		FootballTeam obj = (FootballTeam) context.getBean("bercelona");

		obj.player();

		// FootballTeam objFootballTeam = new Bercelona();
		// FootballTeam objFootballTeam = new Realmadrid();
		// objFootballTeam.player();

		/*
		 * Bercelona bercelonaObj = new Bercelona();
		 * 
		 * bercelonaObj.player();
		 */

		// System.out.println( "Hello World!" );
	}
}
