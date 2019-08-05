import java.util.*;

class FootBall {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int noTestCases = sc.nextInt();
    for(int i=0; i<noTestCases; i++) {
        int n = 0;
        if(sc.hasNextInt()) {
             n = sc.nextInt();
        }
        int goalsArr[] = new int[n];
        int foulArr[] = new int[n];
        
        // Get the values of goals and fouls

        for(int j = 0; j< goalsArr.length; j++) {
            if(sc.hasNextInt()) {
                goalsArr[j] = sc.nextInt();
            }
        }
        for(int k=0; k < foulArr.length; k++) {
            if(sc.hasNextInt()) {
                foulArr[k] = sc.nextInt();
            }
        }
        int max = 0; int prev = 0;
        for(int l=0; l<n; l++) {
            int score = 0;
            score += goalsArr[l] * 20;
            score -= foulArr[l] * 10;
            if(score < 0) {
                score = 0;
            } 
            if(score > prev) {
                max = score;
            } else {
                max = prev;
            }
            prev = score;  
        }
        System.out.println(max);
    }
  }
}