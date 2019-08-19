import java.util.*;

public class SockMerchant {
  public static void main(String args[]) {
      int n = 10;
      int ar[] = {1,1,3,1,2,1,3,3,3,3};
      Arrays.sort(ar);
      List<Integer> tempArr = new ArrayList<Integer>();
      int pairCount = 0;
      for (int i = 0; i < ar.length; i++) {
          for (int j = i+1; j < ar.length; j++) {
              if(ar[i] == ar[j]) {
                  tempArr.add(ar[i]);
              }
              if(j == ar.length-1) {
                  for (int k = 0; k < tempArr.size(); k++) {
                      System.out.print(ar[k] + " ");
                      System.out.println();
                  }
            if(tempArr.size() >= 2) {
                pairCount += tempArr.size()/2;
            }
            tempArr.clear();
            }
          }
      }
      System.out.println(pairCount);
  } 
}