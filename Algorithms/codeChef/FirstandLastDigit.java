import java.util.*;

public class FirstandLastDigit {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int num = sc.nextInt();
          int lastDigit = num % 10;
          int firstDigit = num;
          while(firstDigit >= 10) {
              firstDigit /= 10;
              System.out.println("first "+firstDigit );
          }
          int sum = firstDigit + lastDigit;
          System.out.println(sum);
      }    
  } 
}