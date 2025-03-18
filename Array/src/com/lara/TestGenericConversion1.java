package com.lara;
import java.awt.List;
import java.util.LinkedList;
public class TestGenericConversion1 
{
public static void main(String[] args) 
{
List list=new LinkedList<String>();
list.add("one");
list.add("two");
System.out.println((list.get(0)).length());
}
}
