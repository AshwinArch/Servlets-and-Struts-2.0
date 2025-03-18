package doubt1;
public class Ashwin {
    public static void main(String[] args) {
        String s = "hello";
StringBuffer sb = new StringBuffer(s);
sb.reverse();
        if (s == sb) System.out.println("a");
        if (s.equals(sb)) System.out.println("b");
        if (sb.equals(s)) System.out.println("c");
        
    }
}

