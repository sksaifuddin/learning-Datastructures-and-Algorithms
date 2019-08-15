import java.util.*;

public class InsertionSortPart2 {
  public static void main(String args[]) {
      int arr[] = {1,4,3,5,6,2};
      int n =6;
      for (int i = 1; i < n; i++) {
          int key = arr[i];
          int j = i-1;
          while(j>=0 && arr[j] < key) {
              arr[j+1] = arr[j];
              j = j-1;
          }
          arr[j+1] = key;
          for (int k = 0; k < max; k++) {
              System.out.print(arr[k]+" ");
          }
          System.out.println();
      }    
  } 
}