import java.util.*;

public class test_con {
public static void main (String args []){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter Your Age");
    int age = input.nextInt();
    
    if (age>=18){
        System.out.println("You are eligible for Vote");
    }
    else if (age>13 && age<18){
        System.out.println("Teenager");
    }
    else {
        System.out.println("You are not eligible for Vote");
    }

    input.close();
 }    
}
