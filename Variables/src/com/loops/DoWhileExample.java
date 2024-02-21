package com.loops;

public class DoWhileExample {
public static void main(String[] args) {
	int var=2;
	do
	{
	System.out.println("selenium"+var);         //first it prints selenium2 
	var++;                                       //next  var++ means a=a+1 
	}                                           //next it will check for the condition; if condition true it will go to the loop again until condition fail
	while(var<=8);
	System.out.println(var);
		
}
}
