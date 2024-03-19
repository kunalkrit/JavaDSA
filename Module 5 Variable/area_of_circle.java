import java.util.*;
public class area_of_circle {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter the radius of circle");
     float radius = input.nextFloat();
     float area = 3.14f * radius * radius;  
     System.out.println(area); 

     input.close();
    }
}
