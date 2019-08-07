// https://www.codechef.com/problems/TLG

import java.util.*;

public class TheLeadGame {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int noOfRounds = sc.nextInt();int maxLead = 0;int leader = 0;int cumlativeScoreOne =0; int cumlativeScoretwo =0;
      for(int i=0; i<noOfRounds; i++) {
          int playerOneScore = sc.nextInt();
          int playerTwoScore = sc.nextInt();
          cumlativeScoreOne += playerOneScore; // cumlative score = sum of scores of round  till current round
          cumlativeScoretwo += playerTwoScore;
          if(cumlativeScoreOne > cumlativeScoretwo) {
              if(maxLead < (cumlativeScoreOne - cumlativeScoretwo)) {
                  maxLead = cumlativeScoreOne - cumlativeScoretwo;
                  leader = 1;
              }
          } else {
              if(maxLead < (cumlativeScoretwo - cumlativeScoreOne)) {
                maxLead = cumlativeScoretwo - cumlativeScoreOne;
                leader = 2;
              }
          }
      }
      sc.close();
      System.out.println(leader+" "+maxLead);    
  } 
}