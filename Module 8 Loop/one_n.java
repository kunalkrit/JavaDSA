import java.util.*;

public class one_n {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter No: ");
       int n = input.nextInt();
       int printNo = 1;
       
       while (printNo<=n){
        System.out.print(printNo +" ");
        printNo++;
       } 
       System.out.println(" \n print Successfully");

       input.close();
    }
}
