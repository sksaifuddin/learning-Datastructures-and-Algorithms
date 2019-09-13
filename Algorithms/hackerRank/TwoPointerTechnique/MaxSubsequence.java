import java.util.*;

public class MaxSubsequence {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int testCase = 0; testCase < t; testCase++) {
          int n = sc.nextInt();
          int a[] = new int[n];
          for (int i = 0; i < n; i++) {
              a[i] = sc.nextInt();
          }
          Arrays.sort(a);
          for (int i = 0; i < n; i++) {
                System.out.print("sorted= " + a[i]);
          }
          int p1=0;int p2=1;int startIndex = 0; int endIndex = 0;
          boolean contigousStarted = false;
          while(p2 < n) {
              if(Math.abs(a[p1] - a[p2]) == 1 ) {
                    startIndex = p1;
                    contigousStarted = true;
              }
              if(contigousStarted == true && (Math.abs(a[p1] - a[p2])) != 1) {
                  endIndex = p1;
                  break;
              }
              p1++; p2++;
          }
          System.out.println("start " + startIndex+ " " + "end INdex " + endIndex);
          int count = (endIndex - startIndex) + 1;
          System.out.println("count " + count);
      }    
  } 
}