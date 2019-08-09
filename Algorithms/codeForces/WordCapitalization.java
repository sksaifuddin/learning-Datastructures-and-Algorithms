// http://codeforces.com/problemset/problem/281/A


import java.util.*;

public class WordCapitalization {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String result = "";
      String value = sc.next();
      char valueArr[] = value.toCharArray();
        valueArr[0] = Character.toUpperCase(value.charAt(0));
        for (int i = 0; i < valueArr.length; i++) {
            result += valueArr[i];
        }
        System.out.println(result);
  } 
}