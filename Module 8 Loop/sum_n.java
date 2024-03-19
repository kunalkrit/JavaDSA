import java.util.*;

public class sum_n {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter no:");
       int n = input.nextInt();
       int printNo = 1;
       int sum = 0;

       while (printNo<=n){
        sum+= printNo;     //sum = sum + printNo;
        printNo ++;
       }
       
       System.out.println(sum);
       input.close();
    }
}
