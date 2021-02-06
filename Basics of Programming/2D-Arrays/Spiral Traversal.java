import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for(int p = 0; p < n; p++){
            for(int q = 0; q < m; q++){
                arr[p][q] = scn.nextInt();
            }
        }
            
        int minr = 0;
        int maxr = n - 1;
        int minc = 0;
        int maxc = m - 1;
        int num = n * m;
        int count = 0;
        
        while(count < num){
            //left wall
            for(int i = minr, j = minc; i <= maxr && count < num; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            
            
            //bottom wall
            for(int i = maxr, j = minc; j <= maxc && count < num; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            
            //right wall
            for(int i = maxr, j = maxc; i >= minr && count < num; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            
            //top wall
            for(int i = minr, j = maxc; j >= minc && count < num; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
        
        }
    }
    
