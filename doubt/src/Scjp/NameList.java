/**
 * 
 */
package Scjp;

/**
 * @author Ashwin
 *
 */
import java.util.*;

public class NameList { 
@SuppressWarnings("unchecked")

private List names = new ArrayList();
@SuppressWarnings("unchecked")

public synchronized void add(String name) { names.add(name); } 
public synchronized void printAll() { 
for (int i = 0; i <names.size(); i++) { 
 System.out.print(names.get(i) +" "); 
 } 
 } 
 public static void main(String[] args) { 
 final NameList sl = new NameList(); 
for(int i=0;i<2;i++) { 
	
 new Thread() { 
 public void run() { 
sl.add("A"); 
sl.add("B"); 
sl.add("C"); 
 sl.printAll();
 } 
 }.start(); 
 } 
 } 
 } 
