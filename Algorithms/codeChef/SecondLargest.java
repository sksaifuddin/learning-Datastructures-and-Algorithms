import java.util.*;

public class SecondLargest {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int num[] = new int[3];
          for(int j = 0; j<3; j++ ) {
            num[j] = sc.nextInt();
          }
         Arrays.sort(num);
         System.out.println(num[1]);
      }
  } 
}