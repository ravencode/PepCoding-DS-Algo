import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int idx = 0;
        int fi = firstIndex(arr, idx, x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length - 1){
            return -1;
        }
        if(x == arr[idx]){
            return idx;
        }else{
            int fi = firstIndex(arr, idx + 1, x);
            return fi;
        }
    }
    

}
