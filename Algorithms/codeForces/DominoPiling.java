import java.util.*;

public class DominoPiling {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int numOne = sc.nextInt();
      int numTwo = sc.nextInt();
      int boardArea = numOne * numTwo;
      int finalValue  = boardArea /2;
      System.out.println(finalValue);
  } 
}