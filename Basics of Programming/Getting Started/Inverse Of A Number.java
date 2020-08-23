import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int inv = 0;
  int p = 1;
  while(n > 0){
      int od = n % 10;
      inv = inv + p * (int)Math.pow(10, od - 1);
      n = n / 10;
      p++;
 }
 System.out.println(inv);
}
}
