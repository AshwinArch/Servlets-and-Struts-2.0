package com.lara;
import java.awt.List;
import java.util.LinkedList;
public class TestGenericConversion 
{
private static String one;
private static String two;
public static void main(String[] args) 
{
LinkedList list=new LinkedList();	
LinkedList<String> list1=new LinkedList<String>();
list1.add(one);
list1.add(two);                                                                                                                        
System.out.println((String)list1.get(0)).length());
	}
}
