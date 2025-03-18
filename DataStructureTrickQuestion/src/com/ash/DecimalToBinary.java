package com.ash;
public class DecimalToBinary {
	public static void main(String[] args)
	{
		DecimalToBinary dtb=new DecimalToBinary();
		for(int i:dtb.findBinary(25))
		{
			System.out.print(i);
		}
	}
	public int[] findBinary(Integer i)
	{
		int[] im=new int[25];
		int index=0;
		while(i>0)
		{
			im[index++]=i%2;
			i=i/2;
		}
		int k=0;
		int[] out=new int[index];
		for (int j = index-1;j>=0;j--)
		{
			out[k++]=im[j];
		}
		return out;
	}
}
