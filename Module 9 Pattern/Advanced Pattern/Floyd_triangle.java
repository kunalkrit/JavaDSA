//package Advanced Pattern;

public class Floyd_triangle {
    public static void main(String args[]){
      int n =5;
      int num = 1;

      for (int line=1; line<=n; line++){
         for(int number=1; number<=line; number++){
            System.out.print(num+" ");
            num++;
         }
         System.out.println("");
      }
    }
}
