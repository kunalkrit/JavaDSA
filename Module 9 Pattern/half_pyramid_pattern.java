public class half_pyramid_pattern {
    public static void main(String args[]){
        
        int n = 4;
        for(int line=1; line<=n;line++){
            for(int star=1; star<=line; star++){
                System.out.print(star);
            }
            System.out.println("");
        }
    }
}
