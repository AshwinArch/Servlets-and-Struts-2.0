class A
{
}
class B extends A
{
}
class C extends B
{
}
class D extends C
{
}
class E extends D
{
}
class F extends E
{
}
class Manager extends F 
{
public static void main(String[] args) 
{
            	Manager m1 = new Manager();
            	m1 = test1(m1);
            	System.out.println("done");
}
static D test1 (A a1)
{
            	return (D)test2(a1);
}
static C test2(Object o)
{
            	return (C)o;    
}
}

