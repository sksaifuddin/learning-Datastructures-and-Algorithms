import java.util.*;

public class SumVsXor {
  public static void main(String args[]) {
      long n = 5;int count= 0;
      for (int i = 0; i <= n; i++) {
         long sumRes = n + i;
         long xorRes = n ^ i;
         if(sumRes == xorRes) {
             count++;
         }
      }
      System.out.println(count);    
  } 
}