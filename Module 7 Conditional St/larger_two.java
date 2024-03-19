import java.util.*;

public class larger_two {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter first no");
    int A = input.nextInt();
    System.out.println("Enter Second no");
    int B = input.nextInt();

   // if (A>B){
   // System.out.println(A + " is Greater ");
   // }
    if (A>B)
    System.out.println(A + " is Greater ");
    else {
        System.out.println(B + " is Greater ");
    }
    
    input.close();
  }    
}
