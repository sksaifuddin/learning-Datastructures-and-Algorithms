// https://www.codechef.com/problems/LUCKFOUR

import java.util.*;

public class LuckyFour {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int num = sc.nextInt();
          int countFour = 0;
            while(num > 0) {
                if(num % 10 == 4) {
                    countFour++;
                }
                num = num / 10;
            }
            System.out.println(countFour);
      }    
  } 
}