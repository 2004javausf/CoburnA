package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single line comment
	/*
	 * Multi - 
	 * Line comment
	 * ha
	 * ha
	 */
	/* Why Java?
	 * "WORA" principal -
	 * "Write once, Run anywhere"
	 * OOP
	 * Widespread Use
	 * Great documentation!
	 * Oracle
	 * 	Before them Sun Microsystems used to own it...
	 * version 1.8 aka "Java 8"
	 * 
	 * 3 common acroynyms
	 *  - JDK, JRE, JVM
	 *  
	 * -JVM - Java Virtual Machine
	 * 		  Converts compiled Java code into machine code that your processor can understand
	 * 		  Provides portability. (able to use same Java code on different platforms)
	 *-JRE - Java Runtime Environment
	 *		 JVM + Libraries! 
	 *		 Has everything that we need to RUN Java
	 *-JDK - Java Development Kit
	 *		 Contains JVM + JRE
	 *		 Has compiler, etc...
	 *		 Everything we need to WRITE Java 	 
	 *Object Oriented Programming
	 *	Java is ^!
	 *	Unit of programmability is the OBJECT
	 *	Objects have states and behaviors
	 *	States - aka fields, attributes, variables, etc.
	 *	Behaviors - methods
	 *	Classes - Blueprint of an object
	 */
	
	public static void main(String[] args) {
		/*public - access modifier, everything can access it
		 * 	Static - do NOT to instantiate to use/belongs to the class
		 * 		Void - return type (Void means does not return anything)
		 * String [] args - parameter(s) used for this method
		 * 
		 *  
		 */
		
		System.out.println("Roll Tide");
		System.out.println("Hello");
		Human h = new Human();
		System.out.println(h);
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h.getName());
	}
	
}
