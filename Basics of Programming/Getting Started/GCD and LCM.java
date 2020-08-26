import java.util.*;
        
    public class Main{
        
        public static void main(String[] args) {
              // write your code here  
            Scanner scn = new Scanner(System.in);
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int o1 = num1;
            int o2 = num2;
            while(num1 % num2 != 0){
                int rem = num1 % num2;
                num1 = num2;
                num2 = rem;
            }
            int gcd = num2;
            int lcm = (o1 * o2) / gcd;
            System.out.println(gcd);
            System.out.println(lcm);

        
         }
        }
