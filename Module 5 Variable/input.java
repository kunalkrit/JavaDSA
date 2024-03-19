import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       // String input = sc.nextLine();
       // System.out.println(input);
       
       short s = sc.nextShort();
       boolean b = sc.nextBoolean();
       System.out.println(s);
       System.out.println(b);

       sc.close();
    }
}
