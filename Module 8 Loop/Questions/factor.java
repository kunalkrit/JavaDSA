//package Questions;

import java.util.*;

public class factor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num ;
        int fact = 1;

        System.out.println("Enter positive no");
        num = input.nextInt();

        for (int i=1; i<=num; i++){
            fact*=i;

        }

        System.out.println(fact);
        input.close();
    }
}
