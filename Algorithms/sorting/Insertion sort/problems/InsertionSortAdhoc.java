import java.util.*;

public class InsertionSortAdhoc {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int l = 0; l < t; l++) {
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int k = 0; k < n; k++) {
              arr[k] = sc.nextInt();
          }
          for (int i = 1; i < n; i++) {
              int key = arr[i];
              int j = i-1;
              while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
              }
              arr[j+1] = key;
              System.out.print(j+1+ " ");
          }
      }    
  } 
}