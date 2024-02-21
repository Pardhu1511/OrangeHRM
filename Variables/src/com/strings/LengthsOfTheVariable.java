package com.strings;

public class LengthsOfTheVariable {
public static void main(String[] args) {
	String var1="Its me";
	String var2="Its also me";
	int var1length=var1.length();
	int var2length=var2.length();
	System.out.println("The no  of char in vari-"+var1length);
	System.out.println("The no of char in var2-"+var2length);
	if(var1.length()<var2.length())
	{
		System.out.println("var2 value is greater than var1");
	}
	else
	{
		System.out.println("var2 is less than var1");
	}
	System.out.println();
	String var3="Its me";
	System.out.println("The character at the index 3 is"+var3.charAt(0));
	System.out.println();
}
}
