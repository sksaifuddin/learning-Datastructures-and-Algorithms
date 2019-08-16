import java.util.*;

public class InsertionSortAdvancedAnalysis {
  public static void main(String args[]) {
      int arr[] = {2,1,3,1,2};
      long shiftCount = 0;
      for (int i = 1; i < arr.length;i++) {
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j] > key) {
            arr[j+1] = arr[j];
            shiftCount++;
            j = j-1;
        }
        arr[j+1] = key;
    } 
    System.out.println(shiftCount);      
  } 
}