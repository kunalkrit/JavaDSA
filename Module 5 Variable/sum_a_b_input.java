import java.util.*;

public class sum_a_b_input {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter your first no");
     int a = input.nextInt();
     System.out.println("Enter second number");
     int b = input.nextInt();
     
     int c = a+b;
     System.out.println(c);

     input.close();
    }
}
