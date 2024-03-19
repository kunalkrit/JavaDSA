import java.util.*;

public class largest_three {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first no");
    int _firstNo = input.nextInt();
    System.out.println("Enter your second no");
    int $secondNo = input.nextInt();
    System.out.println("Enter your third no");
    int _third3 = input.nextInt();

    System.out.print("Greatest no: ");

    if (_firstNo >=$secondNo && _firstNo>=_third3){
        System.out.println(_firstNo);
    }
    else if ($secondNo>_third3){
        System.out.println($secondNo);
    }
    else{
        System.out.println(_third3);
    }
    input.close();
    }
}
