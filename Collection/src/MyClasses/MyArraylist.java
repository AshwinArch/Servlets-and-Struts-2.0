package MyClasses;
/**
 * @author Ashwin
 */
public class MyArraylist
{
	private Object elements[]=null;
	private int capacity;
	private int size;
	public MyArraylist()
	{
		capacity=10;
		elements=new Object[capacity];
	}
	public void add(Object obj)
	{
		if(size==capacity)
		{
			alterCapacity();
		}
		elements[size++]=obj;
	}
	public Object get(int index)
	{
		if(index<0||index>=size)
		{
			throw new IndexOutOfBoundsException("-----");
		}
		return elements[index];
	}
	private void alterCapacity()
	{
		capacity=capacity*2;
		Object temp[]=elements;
		elements=new Object[capacity];
		for(int i=0;i<temp.length;i++)
		{
			elements[i]=temp[i];
		}
	}
		public int Size()
		{
			return size;
		}
		public String toString()
		{
			StringBuffer sb=new StringBuffer("[");
			for(int i=0;i<size;i++)
			{
				sb.append(elements[i]+" , ");
			}
			return sb.substring(0, sb.length()-1)+"]";
		}
}

