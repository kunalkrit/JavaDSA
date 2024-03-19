import java.util.*;

public class pass_fail {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your maths marks");
        int maths = input.nextInt();
        System.out.println("Enter your english marks");
        int english = input.nextInt();
        System.out.println("Enter your science marks");
        int science = input.nextInt();

        int total_marks = maths+english+science;
        int  percentage = total_marks/3;

        System.out.println("Total marks " + total_marks + " out of 300");
        
      /*  if (percentage>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
      */ 

      String result = (percentage>=33)? "Pass":"Fail";
      System.out.println(result);
      
        input.close();
    }    
}
