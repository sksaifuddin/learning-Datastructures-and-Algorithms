import java.util.*;

public class FindingSquareRoots {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
        double number = sc.nextDouble();
        double sqrt = Math.sqrt(number);
        System.out.println((int)sqrt);
      } 
  } 
}