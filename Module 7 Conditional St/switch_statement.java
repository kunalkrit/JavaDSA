import java.util.*;

public class switch_statement {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter no");
        int num = input.nextInt();

        switch(num){
            case 1: System.out.println("Kunal");
            break;
            case 2: System.out.println("Ayush");
            break;
            case 3: System.out.println("Aditya");
            break;
            case 4: System.out.println("Abhiraj");
            break;
            default : System.out.println("Ramashankar Singh");
        }

        input.close();
    }
}
