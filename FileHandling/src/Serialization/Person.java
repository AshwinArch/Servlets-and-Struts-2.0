/**
 * 
 */
package Serialization;

import java.io.Serializable;

/**
 * @author Ashwin
 *     transient  and static wont be store value in serialization
 *     so it will give default value...
 */
public class Person implements Serializable
{
	private String firstName;
	private static int age;
	private transient Double weight;
	public Person(String firstName, int age, Double weight)
	{
		this.firstName=firstName;
		this.age=age;
		this.weight=weight;
	}
	public String toString()
	{
		return firstName+","+age+","+weight;
	}
}
