import java.util.*;
public class income_tax {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your income");
        int income = input.nextInt();
        int tax ;

        if (income<500000){
            tax = 0;
        }
        else if (income>500000 && income<1000000){
            tax = (int) (income * 0.2f);
        }
        else {
            tax = (int)(income * 0.3f);
        }
        
        System.out.println("your tax is : " + tax);
        input.close();
    }
}
