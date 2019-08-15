// https://www.hackerrank.com/challenges/insertionsort1/problem

import java.util.*;

public class InsertionSortPart1 {
  public static void main(String args[]) {
      int arr[] = {2,4,6,8,3};
      int n = 5;
      int key = arr[n-1];
      int j = n-2;
      while(j>=0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j=j-1;
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
      }
      arr[j+1] = key;
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+ " ");
      }
      System.out.println();    
  } 
}