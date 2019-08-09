// http://codeforces.com/problemset/problem/339/A

import java.util.*;

public class HelpFulMaths {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String num = sc.next();
      int index = 0;
      char numbersArr[] = new char[(num.length()/2)+1];
      for (int i = 0; i < num.length(); i++) {
            if(i==0  || i%2 == 0) {
                numbersArr[index] = num.charAt(i);
                index++;
            } 
      }
      Arrays.sort(numbersArr);
      String result = "";
      for (int i = 0; i < numbersArr.length; i++) {
          if(i != numbersArr.length-1) {
            result += numbersArr[i]+"+";
          } else {
              result += numbersArr[i];
          }
      }
      System.out.println(result);
      
  } 
}