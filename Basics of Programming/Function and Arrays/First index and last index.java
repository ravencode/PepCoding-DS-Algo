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

        int l = 0;
        int h = arr.length - 1;
        
        int li = -1;
        int fi = -1;
        
        while(l <= h){
            int m = (l + h) / 2;
            if(data > arr[m]){
                l = m + 1;
            }else if(data < arr[m]){
                h = m - 1;
            }else{
                fi = m;
                h = m - 1;
            }
        }
        System.out.println(fi);
        
        l = 0;
        h = arr.length - 1;
        
        while(l <= h){
            int m = (l + h) / 2;
            if(data > arr[m]){
                l = m + 1;
            }else if(data < arr[m]){
                h = m - 1;
            }else{
                li = m;
                l = m + 1;
        }
        }
        System.out.println(li);
    }

}
