import java.util.*;

public class fever {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter body temperature");
    double temp = input.nextDouble();
    
        if (temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }

        input.close();
    }
}
