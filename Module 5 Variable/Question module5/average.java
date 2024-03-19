import java.util.*;

public class average {
   public static void main(String args[]){
   Scanner input = new Scanner (System.in);
   System.out.println("Enter first no");
   int a = input.nextInt();
   System.out.println("Enter second no");
   int b = input.nextInt();
   System.out.println("Enter third no");
   int c = input.nextInt();

   int avg = (a+b+c)/3;
   System.out.println(avg);
   
   input.close();
   } 
}
