//package Advanced Pattern;

public class inverted_half_pyramid {
    public static void main(String args[]) {
        int n = 5;

        for(int line=1; line<=n; line++){
            for(int number=1; number<=n-line+1; number++){
                System.out.print(number+" ");
            }
            System.out.println("");
        }
    }
}
