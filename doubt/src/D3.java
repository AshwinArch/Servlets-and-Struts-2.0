
class A3
{
}
class B3 extends A3
{
}
class C3 extends B3
{
}
public class D3 extends C3
{
public static  void main(String[] args) 
{
		Object all[] = new Object[10];
	 	Object o1 = new Object();
	 	A3 a1 = new A3();
	 	B3 b1 = new B3();
	 	C3 c1 = new C3();
	 	D3 m1 = new D3(); 
        all[0]=m1;
       	all[1]=c1;
       	all[2]=b1;
       	all[3]=a1;
       	all[4]=o1;
       	Object obj = null;
        for(int i=0;i<all.length;i++)
        {
        	obj = all[i];
        	if(obj instanceof Object)
        	{
        		System.out.println("Object type");
          	}
           if(obj instanceof A3)
           {
          		System.out.println("A type");
          	}
              if(obj instanceof B3)
              {
          		System.out.println("B type");
          	
          	}
              if(obj instanceof C3)
              {
          		System.out.println("C type");
          	
          	}
              if(obj instanceof D3)
              {
          		System.out.println("Manager type");
          	   	 System.out.println("------");
          	}
           }        
   }
   }
