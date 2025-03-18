class Test
{
  public static void printMessage(String msg)
  { System.out.println(msg); }
  
  public static void main(String args[])
  {
    int x=10, y=20;
    int b = x + y;
    System.out.println(b);

    String s1 = new String("test"); 
    String s2 =  s1.replace('e', 's'); 
    s1.concat("applet"); 
    System.out.println(s1); 
    System.out.println((s1+s2).charAt(5)); 

  }

}
