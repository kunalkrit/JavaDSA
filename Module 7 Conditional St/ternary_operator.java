import java.util.*;

public class ternary_operator{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter no");
        int num = input.nextInt();
        String even = (num%2==0)? "Even": "Odd";
        System.out.println(even);
        
        input.close();
    }
}