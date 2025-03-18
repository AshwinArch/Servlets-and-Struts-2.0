package com.lara;
public class Flag2 
{
private boolean isReady=false;
public synchronized void produce()
{
	isReady=true;
	notifyAll();
}
public synchronized void consume()
{
	while(!isReady)
	{
	try
	{
	wait();
	}
	catch(Exception ex){}
	}
	isReady=true;
}
}
