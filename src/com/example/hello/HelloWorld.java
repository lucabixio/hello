package com.example.hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This is a simple Hello World class
 * @author lucab
 *
 */
public class HelloWorld {
	
	private static Log log = LogFactory.getLog(HelloWorld.class);

	/**
	 * This is the entry point of our Java Application
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		String name = "World!";
		if (args!=null && args.length > 0) {
			if (args[0] != null) {
				name = args[0];
			}
		}
		
		MessageHandler messageHandler = new MessageHandler();
		
		System.out.println(messageHandler.sayHello(name));
		log.info(messageHandler.sayHello(name));

//		System.out.println("Hello " + name + "!");
//		log.info("Hello " + name + "!");
	}

}
