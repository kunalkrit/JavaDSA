import java.util.*;

public class calculator {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter first no");
       int $firstNo = input.nextInt();
       System.out.println("Enter second no");
       int $secondNo = input.nextInt();

       System.out.println("Choose your opreation + , - , *,/ ");
       String oper = input.next();
       // char oper = input.next().charAt(0);

       int exp =0;

       switch(oper){

        case "+": exp = $firstNo + $secondNo;
        break;

        case "-": exp = $firstNo - $secondNo;
        break;

        case "*": exp = $firstNo * $secondNo;
        break;

        case "/": exp = $firstNo / $secondNo;
        break;

        default : System.out.println("Error in your opretion");

       } 
       System.out.println(exp);

       input.close();
    }
}
