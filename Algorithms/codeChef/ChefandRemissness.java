import java.util.*;

public class ChefandRemissness {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int numOne = sc.nextInt();
          int numTwo = sc.nextInt();
          if(numOne < numTwo) {
            System.out.println(numTwo+" "+ (numOne+numTwo));
          } else {
              System.out.println(numOne+" "+ (numOne+numTwo));
          }
      }    
  } 
}