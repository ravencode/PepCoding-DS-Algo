import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt(); 
        int spc = 0;
        int str = n;
        for (int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= spc; j++){
                System.out.print("\t");
            }
            
            for(int j = 1; j <= str; j++){
                if(i > 1 && i <= n / 2 && j > 1 && j < str ){
                    System.out.print("\t");
                }
                else{
                System.out.print("*\t");
                }
            }
            if(i <= n / 2){
                str -= 2;
                spc++;
            }
            else{
                str += 2;
                spc--;
            }
            System.out.println();


        }
    }

}
