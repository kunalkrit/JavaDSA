//package Questions;

import java.util.*;

public class sum_even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int even =0;
        int odd = 0;
        int choice;
        //for(int i = 1; i<=5;i++){
        //    System.out.println("enter no:");
        //    int n = input.nextInt();
        //    if(n %2==0){
        //     even = even+n; 
        //    }
        //    else{
        //        odd = odd+n;
        //    }
        //
        //    
        //}
        //
        //System.out.println("Even:"+even);
        //System.out.println("Odd:"+odd);
        
        do{
            System.out.println("enter no:");
            int n = input.nextInt();
            if(n %2==0){
             even = even+n; 
            }
            else{
                odd = odd+n;
            }
            
            System.out.println("enter 1 for ");
              choice=input.nextInt();
        
        }while(choice==1);

        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);
        input.close();
    }
}
