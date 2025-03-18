/**
 * 
 */
package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


/**
 * @author Ashwin
 *
 */
public class Person implements Externalizable
{
	private String firstName;
	private  int age;
	private  Double weight;
	public Person(){}
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

	/* (non-Javadoc)
	 * @see java.io.Externalizable#readExternal(java.io.ObjectInput)
	 */
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		// TODO Auto-generated method stub
		firstName =in.readUTF();
		age=in.readInt();
//		weight=in.readDouble();
	}

	/* (non-Javadoc)
	 * @see java.io.Externalizable#writeExternal(java.io.ObjectOutput)
	 */
	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeUTF(firstName);
		out.writeInt(age);
//		out.writeDouble(weight);
	}
}
