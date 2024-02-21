package com.strings;

public class ExistanceOfOneStringInAnotherStringEx {
public static void main(String[] args) {         //checking existance of one string value in another string value.
                                                 //by using "contain method".
	String var1="me";
	String var2="Its me";
	if(var2.contains(var1))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("not");
	}
}
}
