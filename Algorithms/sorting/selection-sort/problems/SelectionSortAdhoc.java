import java.util.*;

public class SelectionSortAdhoc {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int arraySize = sc.nextInt();
          int arr[] = new int[arraySize];
          for (int j = 0; j < arraySize; j++) {
              arr[j] = sc.nextInt();
          }

          int min = 0;
          for(int k=0; k< arr.length; k++) {
              min = k;
              for(int l = k+1; l < arr.length ; l++) {
                  if(arr[l] > arr[min]) {
              System.out.print("k-->"+k+" ");
                    min = l;
                  }
              }
            //   System.out.print("k-->"+k+" ");
              int temp = arr[min];
              arr[min] = arr[k];
              arr[k] = temp;
          }
          System.out.println();
        //   for (int z = 0; z < arr.length; z++) {
        //       System.out.println(arr[z]);
        //   }
      }  
  } 
}