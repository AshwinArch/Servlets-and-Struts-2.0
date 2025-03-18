package MyClasses;
import java.util.Hashtable;
/**
 * @author Ashwin
 */
class MyThread
{
	private Hashtable table=new Hashtable();
	public void set(Object obj)
	{
		long id=Thread.currentThread().getId();
		table.put(id, obj);
	}
	public Object get()
	{
		long id=Thread.currentThread().getId();
		return table.get(id);
	}
}
