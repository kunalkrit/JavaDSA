import java.util.*;

public class continue_question {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        do{
            System.out.println("enter no:");
            int n = input.nextInt();
            input.close();
            if (n%10==0){
                continue;
            }
            System.out.println(n);
            n++;
        }while(true);
        

        }
        
    }

