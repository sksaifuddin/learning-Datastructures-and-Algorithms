import java.util.*;

public class FlipBits {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int first = sc.nextInt();
          int second = sc.nextInt();
          int xor = first ^ second;
          int count = 0;
          while(xor != 0) {
            if((xor & 1) == 1) {
                count++;
            }
            xor = xor >> 1;
          }
          System.out.println(count);
      }    
  } 
}