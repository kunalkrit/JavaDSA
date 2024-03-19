import java.util.*;

public class calculateSum {

    public static int calculateSom(int num1,int num2){  // parameters or formal parameters
        int sum =num1+num2;
        return sum;
    }

    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum =calculateSom(a,b); // arguments or actual parameters
        System.out.println("Sum is :"+sum);

        input.close();
    }
}
