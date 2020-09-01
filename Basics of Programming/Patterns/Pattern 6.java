import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write ur code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spc = 1;
        int str = (n+1)/2;
        for (int i = 1; i <= n; i++) {
 
              for(int j = 1; j <=str; j++){
                  System.out.print("*	");
              }
        
            for(int j = 1; j <= spc; j++){
                System.out.print("	");
            }
            for(int j = 1; j <=str; j++){
                System.out.print("*	");
             }
             
          
            
           
            if(i <= n/2){
               spc = spc + 2;
               str--;
            }
            else{
                str++;
                spc = spc - 2;
            }
            System.out.println();
        }
    }
}
