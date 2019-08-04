
import java.util.*;

public class Team {
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int count = 0;
     for(int i=0; i<n;i++) {
        int solutionCount = 0;
         for(int j=1; j<=3; j++) {
             int score = sc.nextInt();
             if(score > 0) {
                solutionCount++;
             }
             if(j==3 && solutionCount > 1) {
                 count++;
             }
         }
     }
     System.out.println(count);
  }
}