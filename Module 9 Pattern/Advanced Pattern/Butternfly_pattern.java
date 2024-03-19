//package Advanced Pattern;

public class Butternfly_pattern {
    public static void main(String[] args) {
        int m = 1;
        int n = 4;
        for(int line=1; line<=n;line++){
            for(int star=1; star<=line;star++){
                System.out.print("*");
            }
            for(int star=1; star<=n-line;star++){
                System.out.print(" ");
            }
            for(int star=1; star<=n-line;star++){
                System.out.print(" ");
            }
            for(int star=1; star<=line;star++){
                System.out.print("*");
            }
            // half completed

            System.out.println("");

        }
        for(int line=4;line>=1; line--){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            for(int spc=1;spc<=4-line;spc++){
                System.out.print(" ");
            }
            for(int spc=1;spc<=4-line;spc++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println("");
        }    
    }
}
