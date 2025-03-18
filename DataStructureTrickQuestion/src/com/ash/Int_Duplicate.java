/**
 * 
 */
package com.ash;

import java.util.*;
/**
 * @author Diesel
 *
 */
public class Int_Duplicate	
{
	public static void main(String[] args)
	{
		Int_Duplicate id=new Int_Duplicate();
		System.out.println(id.dup(id.fill()));
	}
/**
 * 
 */
	public List<Integer> dup(List<Integer> l)
	{
		Collections.sort(l);
		List li=new ArrayList<Integer>();
		
		for (int i = 1; i < l.size(); i++)
		{
			if(l.get(i)==l.get(i-1))
			{
				li.add(l.get(i));
			}
		}
		return li;
	}

public List<Integer> fill()
{
	List<Integer> li=new ArrayList<Integer>();
	for(int i=1;i<30;i++)
	{
		li.add(i);
	}
	li.add(11);
	return li;
}

}
