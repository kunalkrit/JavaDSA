import java.util.*;

public class sum_of_digit {
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter no : ");
        int num = input.nextInt();
        System.out.println(sumDigit(num));

        input.close();
        
    }

    public static int sumDigit(int num){
        int sumOfDigit = 0;

        while(num>0){
            int lastNum = num % 10 ;
            sumOfDigit += lastNum;
            num /= 10;           // num = num /10 ;
        }
        return sumOfDigit ;
    }
}
