import java.util.*;

public class NextRound {
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        k = k-1;int count = 0;
        int[] scores = new int[n];
        for(int i=0; i< scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        for(int j =0; j< scores.length; j++) {
            if(scores[j] > 0) {
                if(scores[j] >= scores[k]) {
                    count++;
                }
            }
        }
        System.out.println(count);
  }
}