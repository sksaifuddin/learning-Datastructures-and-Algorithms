import java.util.*;

public class DivisibleSumPairs {
  public static void main(String args[]) {
      int n = 6;
      int k = 3;
      int ar[] = {1,3,2,6,1,2};
      int count =0 ;
      for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if((ar[i] + ar[j]) % 3 == 0 ) {
                    count++;
                }
            }
      }
      System.out.println(count);
  } 
}