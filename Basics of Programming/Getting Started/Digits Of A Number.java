import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int temp  = n;
      int count = 0;
      while(temp > 0){
          temp = temp / 10;
          count++;
      }
      int a = (int)Math.pow(10,count-1);
      while(a > 0){
          
          System.out.println(n/a);
          n = n % a;
          a = a /10;
      }
     }
    }
