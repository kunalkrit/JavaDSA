//import java.util.*;

public class pattern {

    public static void hollowRectangle(int noRow , int noCol){
        
        for(int row=1; row<=noRow; row++){
            for(int col=1; col<=noCol; col++ ){
                if (row==1 || row==noRow || col==1 || col==noCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }

    public static void invertedRotated_halfPyramid(int noRow){
       // no of line
        for(int line=1; line<=noRow; line++){
         // space
         for(int spc=1; spc<=noRow-line; spc++){
            System.out.print(" ");
         }
         // star
         for(int star=1; star<=line; star++){
            System.out.print("*");
         }
         System.out.println("");
       }  
    }

    public static void invertedHalfPyramidNum(int noLline){
        for (int line=1; line<=noLline; line++){
            for(int num=1; num<=noLline-line+1; num++){
                System.out.print(num);
            }
            System.out.println("");
        }
    }

    public static void floyid_triangle(int noOfLine){
        int number = 1;
        for(int line=1 ; line<=noOfLine; line ++){

            for(int printNum=1 ; printNum <=line; printNum++){
              System.out.print(number+" ");
              number++;
            }
            System.out.println("");
        }
    }

    public static void zero_one_triangle(int noLine){
        
        for(int line=1; line<=noLine; line++){
           
            for(int num=1; num<=line; num++){
              if ((line+num) % 2==0 ){
                System.out.print("1");
              }
              else{
                System.out.print("0");
              }
            }
            System.out.println("");
        }
    }

    public static void zeroOneTriangle(int noRow){
         
        int num = 1;
        for(int line=1; line<=noRow; line++){
            
            for(int j=1; j<=line; j++ ){
                System.out.print(num);
                if(num==1){
                    num=0;
                }
                else{
                    num=1;
                }
            }
            System.out.println("");
        }
    }

    public static void butterfly(int n){
        
        // 1st half
        for(int line=1; line<=n;line++){
            // star
            for(int j=1; j<=line; j++){
                System.out.print("*");
            }

            // space
            for(int j=1; j<=2*(n-line); j++){
                System.out.print(" ");
            }

            // star
            for(int j=1; j<=line; j++){
                System.out.print("*");
            }

            System.out.println("");
      }

      // 2nd half
      for(int line=n; line>=1; line--){
         // star
         for(int j=1; j<=line; j++){
            System.out.print("*");
        }

        // space
        for(int j=1; j<=2*(n-line); j++){
            System.out.print(" ");
        }

        // star
        for(int j=1; j<=line; j++){
            System.out.print("*");
        }

        System.out.println("");
      }  
    }
    
    public static void solidRhombus(int n){
        for(int line=1; line<=n; line++){
            //space
            for(int j=1; j<=(n-line); j++){
                System.out.print(" ");
            }
            // star 
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void hollowRombus(int n){
       // not of line / rows
        for (int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void dimondPattern(int n){
        // no of line/ row
        for(int line=1; line<=n; line++){
            // space
            for(int j=1; j<=(n-line); j++){
                System.out.print(" ");
            }
            // star 
            for(int j=1; j<=(2*line)-1; j++){
                System.out.print("*");
            }  
            System.out.println("");

        }

        // 2nd half part
        for(int line=n; line>=1; line--){
            // space
            for(int j=1; j<=(n-line); j++){
                System.out.print(" ");
            }
            // star 
            for(int j=1; j<=(2*line)-1; j++){
                System.out.print("*");
            }  
            System.out.println("");
        }
    }

    public static void numPyramid(int n){
        // no of line
        for(int line=1; line<=n; line++){
            // space
            for(int j=1; j<=(n-line);j++){
                System.out.print(" ");
            }
            // number
            for(int j=1; j<=line; j++){
                System.out.print(line+" ");
            }
            System.out.println("");
        }
    }
    public static void palindromicPattern(int n){
        // no of line 
        for(int line=1; line<=n; line++){
            // space
            for(int j=1; j<=(n-line); j++){
                System.out.print(" ");
            }
            // decending numbers
            for(int j=line; j>=1; j--){
               System.out.print(j);
            }
            // acending nunber 
            for(int j=2; j<=line; j++){
                System.out.print(j);
            }

            System.out.println("");
        }
    }
    public static void main (String args[]){
     // zero_one_triangle(5);
     // zeroOneTriangle(5);
     //butterfly(4);
     // solidRhombus(5);
     //hollowRombus(5);
     //dimondPattern(4);
     //numPyramid(5);
     palindromicPattern(5);


    }
}
