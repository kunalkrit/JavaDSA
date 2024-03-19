//package Question;

import java.util.*;

public class palindrome{
    
    public static int revNum(int orgNum){
        int revNum = 0;
        while (orgNum>0){
            int lastNum = orgNum % 10;
            revNum = (revNum*10) + lastNum;

            orgNum = orgNum /10;
        }

        return revNum;
    }

    public static boolean palindNum(int orgNum){
        int revNum = revNum(orgNum);
        if (orgNum ==revNum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your no : ");
        int orgNum=input.nextInt();
        if(palindNum(orgNum)){
            System.out.println(orgNum+" is palindrome of "+revNum(orgNum));
        }
        else{
            System.out.println(orgNum+" is not palindrome of "+revNum(orgNum));
        }

        input.close(); 
    }
}
