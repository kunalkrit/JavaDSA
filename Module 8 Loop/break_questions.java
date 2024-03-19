import java.util.*;

public class break_questions {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
         
        do {
            System.out.print("enter: ");
            int n = input.nextInt();

            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
       
        input.close();
        
    }
}
