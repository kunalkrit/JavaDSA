// package Questions;

import java.util.*;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter year :");
        int year = input.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not leap year");
        }

        input.close();
    }
}
