import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        
        int lo = 0;
        int hi = arr.length - 1;
        int c = 0;
        int f = 0;
        
        while(lo <= hi){
            int m = (lo + hi) / 2;
            if(data > arr[m]){
                lo = m + 1;
                f = arr[m];
            }else if(data < arr[m]){
                hi = m - 1;
                c = arr[m];
            }else{
                c = arr[m];
                f = arr[m];
                break;
            }
        }
        System.out.println(c);
        System.out.println(f);
        
    }

}
