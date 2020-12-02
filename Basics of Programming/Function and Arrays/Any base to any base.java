import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();

      int dm = anyBaseToDecimal(n, b1);
      int ab = decimalToAnyBase(dm, b2);
      System.out.println(ab);
   }
  
    public static int anyBaseToDecimal(int n, int b){
       // write code here
       int rv = 0;
       int p = 1;
       while(n > 0){
           int rem = n % 10;
           n = n / 10;
           rv += rem * p;
           p = p * b;
       }
       return rv;
  }
   
   public static int decimalToAnyBase(int n, int b){
       // write code here
       int rv = 0;
       int p = 1;
       while(n > 0){
           int rem = n % b;
           n = n / b;
           
           rv += rem * p;
           p = p * 10;
       }
       return rv;
   }
 }
  
