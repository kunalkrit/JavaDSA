//package Advanced Pattern;

public class hollow_rectangle {
    public static void main(String args[]){

        for(int line=1; line<=4; line++){
            if(line==1 || line==4){
                for(int star=1; star<=5; star++){
                    System.out.print("* ");
                   }  
            }
            else{
                for(int star=1; star<=5; star++){
                    if(star==1 || star==5){
                       System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }             
                   }  
            }
            
            System.out.println("");
        }
    }
}
