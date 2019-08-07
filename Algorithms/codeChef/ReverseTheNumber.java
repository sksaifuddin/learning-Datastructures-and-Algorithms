// https://www.codechef.com/problems/FLOW007

import java.util.*;

public class ReverseTheNumber {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int result = 0;
            while(num != 0) {
                int lastDigit = num % 10;
                result = result * 10 + lastDigit;
                num = num / 10;
            }
            System.out.println(result);
      }  
  } 
}