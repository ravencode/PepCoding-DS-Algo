import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int str1 = n / 2;
        int str2 = n / 2 + 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                }else if(i > n / 2 && (i == j || i + j == n +1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            
         System.out.println();

        }
    }
}
