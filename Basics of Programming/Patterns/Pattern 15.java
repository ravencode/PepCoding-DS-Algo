import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nn = 1;
        int val = 1;
        int k = 1;
        int spc = n / 2;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spc; j++){
                System.out.print("\t");
            }
            for(int j =1; j <=nn; j++){
                System.out.print(k+ "\t");
                if(j <= nn){
                    k++;
                }
                if(j > nn /  2){
                    k -= 2;
                }
            }
            
            if(i <= n / 2){
                spc--;
                nn += 2;
                val++;
                k = val;
            }
            else{
                spc++;
                nn -= 2;
                val--;
                k = val;

            } 
        System.out.println();

        }
    }
}
