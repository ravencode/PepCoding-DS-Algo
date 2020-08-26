import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        
        k = k % count;
        if (k < 0) {
            k = k + count;
        }
        int div = 1;
        int multi = 1;
        for (int i = 1; i <= count; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                multi = multi * 10;
            }
        }
        
        int r = n % div;
        int q = n / div;

        int rot = r * multi + q;

        System.out.println(rot);
    }
}
