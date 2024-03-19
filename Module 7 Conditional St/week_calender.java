import java.util.*;

public class week_calender {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Choose day by fir 3 letter");
     String day = input.nextLine();

     switch(day){

        case "sun": System.out.println("Sunday");
        break;

        case "mon": System.out.println("Monday");
        break;

        case "tue": System.out.println("Tuesday");
        break;

        case "wed": System.out.println("Wednesday");
        break;

        case "thr": System.out.println("Thrusday");
        break;

        case "fri": System.out.println("Friday");
        break;

        case "sat": System.out.println("Saturday");
        break;

        default : System.out.println("Holyday");

     }

     input.close();
     
    }
}
