import java.util.*;

public class print_reverse_no {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter no: ");
        int num = input.nextInt();
        int lastNo;

         while (num>0){
         lastNo = num%10;
         System.out.print(lastNo);
         num = num/10;
         }

       // for(int i = 0; num>i;num = num/10){
       //     lastNo = num%10;
       //     System.out.print(lastNo);
       // }

        input.close();
    }
}
