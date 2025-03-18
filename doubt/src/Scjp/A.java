/**
 * 
 */
package Scjp;

import java.io.IOException;

/**
 * @author Ashwin
 *
 */

class a2 {
 public void process() { System.out.print("A,"); } } 
 class B extends a2 {
 public void process() throws IOException { 
 super.process();
 System.out.print("B,"); 
 throw new IOException(); 
 } }
 public class A
 {
 public static void main(String[] args) { 
 try { new B().process(); } 
 catch (IOException e) { System.out.println("Exception"); } } 
}