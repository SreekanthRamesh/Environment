package com.home.src.helloEnvironment;

import java.io.Console;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		System.out.println("User Name" +System.getenv("USER_NAME"));
		System.out.println("Password" +System.getenv("PASSWORD"));
	}
}
 