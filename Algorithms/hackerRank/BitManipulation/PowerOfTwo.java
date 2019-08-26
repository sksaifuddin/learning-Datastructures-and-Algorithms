import java.util.*;

public class PowerOfTwo {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          long num = sc.nextLong();
          if((num & (num-1)) == 0) {
                System.out.println("True");
          } else {
              System.out.println("False");
          }
      }    
  } 
}