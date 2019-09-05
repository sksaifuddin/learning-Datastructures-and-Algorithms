import java.util.*;

public class SpiralTraversal {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int testCase = 0; testCase < t; testCase++) {
          int n = sc.nextInt();
          int a[][] = new int[n][n];
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                  a[i][j] = sc.nextInt();
              }
          }
          int startingRowIndex = 0;int startingColumnIndex = 0;
          int endRowIndex = n; int endColumnIndex = n;
          while(startingRowIndex < endRowIndex && startingColumnIndex < endColumnIndex) {
              for (int i = startingColumnIndex; i < endRowIndex; i++) {
                  System.out.print(a[startingRowIndex][i]+" ");
              }
              startingRowIndex++;

              for (int i = startingRowIndex; i < endRowIndex; i++) {
                  System.out.print( a[i][endColumnIndex-1]+" ");
              }
              endColumnIndex--;

              if(startingRowIndex < endRowIndex) {
                  for (int i = endColumnIndex-1; i >= startingColumnIndex; i--) {
                      System.out.print(a[endRowIndex-1][i]+" ");
                  }
                  endRowIndex--;
              }


              if(startingColumnIndex < endColumnIndex) {
                  for (int i = endRowIndex-1; i >= startingRowIndex; i--) {
                      System.out.print(a[i][startingColumnIndex]+" ");
                  }
                  startingColumnIndex++;
              }
          } 
          System.out.println();
      }    
  } 
}