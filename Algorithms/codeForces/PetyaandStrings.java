// http://codeforces.com/problemset/problem/112/A

import java.util.*;

public class PetyaandStrings {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String stringOne = sc.next();
      String stringTwo = sc.next();
      if(stringOne.compareToIgnoreCase(stringTwo) > 0) {
            System.out.println(1);
      } else if(stringOne.compareToIgnoreCase(stringTwo) < 0) {
          System.out.println(-1);
      } else {
          System.out.println(0);
      }
      sc.close();
  } 
}