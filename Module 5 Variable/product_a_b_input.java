import java.util.*;

public class product_a_b_input{
    public static void main(String args[]){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter first no");
    int a = input.nextInt();
    System.out.println("Enter second no");
    int b = input.nextInt();
    int product = a*b;
    System.out.println(product);

    input.close();

    }
}
