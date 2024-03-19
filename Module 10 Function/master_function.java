import java.util.*;

public class master_function {
    
    // multiplication
    public static int multiProduct(int a, int b){
        int product = a*b;
        return product;
    }
    
    // factorial
    public static int Factorail(int n){
        int fact=1;
        
        for(int i=1; i<=n; i++){
            fact*=i;
        }

        return fact;
    }
    
    // binomial cooficient
    public static int binomial(int n,int r){
        int nFact=Factorail(n);
        int rFact = Factorail(r);
        int nmrFact = Factorail(n-r);

        int binCof = nFact/(rFact*nmrFact);

        return binCof;
    }
    
    // prime no 
    public static void primeNo(int num){
        boolean isPrime=true;

        if (num==2){
            System.out.println("Prime no");
        }
        else{
            for(int i =2; i<=num-1;i++ ){
                if (num%i==0){
                    isPrime=false;
                }
            }
    
            if (isPrime==true){
                System.out.println("Prime no");
            }
            else{
                System.out.println("Composite no");
            }
        }
        
    }
    
    // prime no 
    public static boolean primeNum(int n){
        
        if(n==2){
            return true;
        }
        else{
            for(int i =2; i<=n-1; i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    // prime no optimised 
    public static boolean primeNumber(int n){
        
        if(n==2){
            return true;
        }
        else{
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }    
            }
        }
        
        return true;
    }
    
    // prime in n range
    public static void primeInRange(int n){
        for(int i=2; i<=n;i++){
         if(primeNum(i)){
            System.out.print(i+" ");

         }
        }
        System.out.println("");
    }
    
    // convert binary to decimal
    public static void BinToDec(int binNum){
        int bin= binNum;
        int pow = 0;
        int decNum =0;

        while(binNum>0){
            int lastNum = binNum % 10;

            decNum = decNum + ( lastNum * (int)Math.pow(2, pow) );
            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of "+bin+ " = "+decNum);
    }

    public static void decToBinary(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum>0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;

        }

        System.out.println("Binary of "+ myNum + " = "+binNum);
    }
    
    public static void avgThreeNo(int num1,int num2, int num3){
        int avg = (num1 + num2 + num3)/3;
        System.out.println("Average is : "+avg);
    }

    public static double avg(double a ,double b, double c){
        return (a+b+c)/3;
    }

    public static boolean isEven(int n){
        if (n %2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){  
    Scanner input = new Scanner (System.in);
    System.out.print("Enter your no : ");
    int even = input.nextInt();

    if (isEven(even)){
        System.out.println(even +" is Even");
    }
    else{
        System.out.println(even +" is Odd");
    }
    
    input.close();
    }
}
