import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write ur code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spc = 0;
        int str = n;
        for (int i = 1; i <= n; i++) {
 
            for(int j = 1; j <= spc; j++){
                System.out.print("	");
            }
            for(int j = 1; j <=str; j++){
                System.out.print("*	");
            }
           
            spc++;
            str--;
            System.out.println();
        }
    }
}