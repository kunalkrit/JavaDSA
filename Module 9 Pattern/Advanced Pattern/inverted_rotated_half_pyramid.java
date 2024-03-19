//package Advanced Pattern;

public class inverted_rotated_half_pyramid {
    public static void main (String args[]){
        
        int n=4;
        for(int line=1; line<=n; line++){
           for(int spc=1; spc<=n-line; spc++){
            System.out.print("   ");
           }
           for(int star=1; star<=line; star++){
            System.out.print(" * ");
           }
           System.out.println("");
        }
    }
}
