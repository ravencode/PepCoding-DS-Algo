import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        // write ur code here
        int low = scn.nextInt(); 
        int high = scn.nextInt(); 
        for(int n = low; n <= high; n++){
        int count = 0;
            for(int i = 2; i * i <= n; i++){
                if(n%i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
  }
}
