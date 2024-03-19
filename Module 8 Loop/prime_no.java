import java.util.*;

public class prime_no {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("enter no: ");
        int n = input.nextInt();
        
        if (n==2){
            System.out.println(n+": is prime no");
        }
        else{
            boolean isPrime = true;

        for (int i =2; i<=Math.sqrt(n)/*(n-1)*/; i++){
            if(n%i==0){
                isPrime=false;
            }
        }

        if (isPrime==true){
            System.out.println(n+": is prime no");
        }
        else{
            System.out.println(n+": is Composite no");
        }
        }     

        input.close();
    }
}
