import java.util.*;

public class LonelyInteger {
  public static void main(String args[]) {
      int a[] = {0,0,1,2,1};
      int res = 0;
      for (int i = 0; i < a.length; i++) {
            res = res ^ a[i] ;
      }
      System.out.println(res);

  } 
}