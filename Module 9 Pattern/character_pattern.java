public class character_pattern {
    public static void main (String args[]){
        
        int n=4;
        char a = 'A';
        for (int line=1; line<=n; line++){
           
            for (int cha=1; cha<=line; cha++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }
    }
}
