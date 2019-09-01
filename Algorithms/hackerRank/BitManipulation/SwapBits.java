import java.util.*;

public class SwapBits {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int num = sc.nextInt();
          int result = (((num & 0xAAAAAAAA) >> 1) | ((num & 0x55555555) << 1));
          System.out.println(result);
      }    
  } 
}