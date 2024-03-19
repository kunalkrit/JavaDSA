public class continu {
    public static void main(String[] args) {
    
        for (int n = 1; n<=20; n++){
            if(n%2==0){
                continue;
            }
            System.out.println(n);
            n++;
        }
    }
}
