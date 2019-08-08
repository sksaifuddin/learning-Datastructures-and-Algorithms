import java.util.*;

public class SmallFact {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int num = sc.nextInt();
          if(num == 0) {
            System.out.println(1);
          } else {
            int result = 1;
            for(int j = 1; j<= num; j++) {
              result = result*j;
            }
            System.out.println(result);
          }
      }    
  } 
}