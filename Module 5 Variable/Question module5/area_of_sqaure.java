import java.util.*;

public class area_of_sqaure {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter side of square");
    int side = input.nextInt();
    int area = side*side;
    System.out.println(area);  
    
    input.close();
    }
}
