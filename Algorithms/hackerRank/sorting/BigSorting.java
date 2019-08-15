import java.math.BigInteger;
import java.util.*;

public class BigSorting {
  public static void main(String args[]) {
      String unsorted[] = {"31415926535897932384626433832795", "1", "3", "10", "3", "5"};
      for (int i = 0; i < unsorted.length; i++) {
            for(int j=i+1; j< unsorted.length; j++) {
             BigInteger b1 = new BigInteger(unsorted[i]); 
             BigInteger b2 = new BigInteger(unsorted[j]);
             if(b1.compareTo(b2) == 1) {
                 String temp = unsorted[i];
                 unsorted[i] = unsorted[j];
                 unsorted[j] = temp;
             }
            }       
      }
      for (int i = 0; i < unsorted.length; i++) {
          System.out.println(unsorted[i]);
      }    
  } 
}