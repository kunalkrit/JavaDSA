//package Questions;

import java.util.*;

public class week_days {
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter week no. (1-7)");
        int weekNo = input.nextInt();

        switch(weekNo){

            case 1: System.out.println("Sunday");
            break;

            case 2: System.out.println("Monday");
            break;

            case 3: System.out.println("Tuesday");
            break;

            case 4: System.out.println("Wednesday");
            break;

            case 5: System.out.println("Thrusday");
            break;

            case 6: System.out.println("Friday");
            break;

            case 7: System.out.println("Saturday");
            break;
            
            default : System.out.println("Wrong no"); 

        }

        input.close();
    }
}
