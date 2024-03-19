import java.util.*;

public class negative_positive {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter no : ");
        int num = input.nextInt();

        if (num>=0) {
        System.out.println("positive no");
        }
        else {
        System.out.println("negative no");
        }

        input.close();
    }
}
