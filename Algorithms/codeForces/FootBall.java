// http://codeforces.com/problemset/problem/96/A

import java.util.*;

public class FootBall {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String players = sc.next();
      char previousPlayer = '2'; char currentPlayer = '0';int count = 1;
      for (int i = 0; i < players.length(); i++) {
          currentPlayer = players.charAt(i);
          if(previousPlayer != '2') {
            if(currentPlayer == previousPlayer) {
                count++;
            } else {
                count = 1;
            }
            if(count >= 7) {
                break;
            }
          }
          previousPlayer = currentPlayer;
      }
      if(count >= 7) {
        System.out.println("YES");
      } else {
          System.out.println("NO");
      }
  } 
}