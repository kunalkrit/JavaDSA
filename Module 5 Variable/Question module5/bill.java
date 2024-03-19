import java.util.*;

public class bill {
   public static void main(String args[]){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter price of Pencil");
    float pencilprice = input.nextFloat();
    System.out.println("Enter price of Pen");
    float penprice = input.nextFloat();
    System.out.println("Enter price of Eraser");
    float eraserprice = input.nextFloat();

    float total_price = pencilprice + penprice + eraserprice;
    System.out.println("Total price " + total_price);

    float gst = total_price + (0.18f * total_price);

   // float total_price_gst = total_price + gst;

    System.out.println("With gst "+ gst);
     
    input.close();
   } 
}
