public class function_overload {

    //public static int sum(int a, int b){
    //    return a+b;
    //}

    //public static int sum(int a , int b, int c){
    //    return a+b+c;
    //}

    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String args[]){
     System.out.println(sum(2,5));
     System.out.println(sum(2.3f,1.9f));
    }
}
