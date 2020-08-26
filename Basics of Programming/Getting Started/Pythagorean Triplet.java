import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    int l = 1;
    if(a > b && a > c){
        l = a;
        if(b*b + c*c == a*a)
            System.out.println("true");
        else
            System.out.println("false");

    }
    else if(b > a && b > c){
        l = b;
        if(a*a + c*c == b*b)
            System.out.println("true");
        else
            System.out.println("false");
    }
    else{
        l = c;
        if(a*a + b*b == c*c)
            System.out.println("true");
        else
            System.out.println("false");
    
    }
   }
  }
