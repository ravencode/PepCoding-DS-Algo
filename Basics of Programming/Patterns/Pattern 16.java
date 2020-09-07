import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int spc = (n * 2) - 3;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == n){
                    continue;
                }
                System.out.print(j + "\t");

            }
            for (int j = 1; j <= spc; j++) {
                System.out.print("\t");
            }
          
            for (int j = i; j >= 1; j--) {

                System.out.print(j + "\t");
            }
            spc -= 2;
            System.out.println();

        }

    }
}
