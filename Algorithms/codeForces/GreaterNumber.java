import java.util.*;

public class GreaterNumber {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int numOne = sc.nextInt();
      int numTwo = sc.nextInt();
      if(numOne >  numTwo) {
          System.out.println(numOne);
      } else {
          System.out.println(numTwo);
      }
  } 
}