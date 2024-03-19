public class save_reverse_no {
    public static void main(String args[]){
        int num = 10899;
        int lastNo ;
        int revNo=0;

        while (num>0){
            lastNo = num%10;
            revNo = (revNo*10)+lastNo;
            num = num/10;
        }

        System.out.println(revNo);
    }
}
