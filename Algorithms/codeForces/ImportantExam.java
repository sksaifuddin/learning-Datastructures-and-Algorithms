// not completed

import java.util.*;

public class ImportantExam {
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String answer = "";
        int sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m ; j++) {
                answer = sc.next();
            }
            for(int k=0; k< m; k++) {
                sum += sc.nextInt();
            }
        }
        System.out.println(sum);
  }
}