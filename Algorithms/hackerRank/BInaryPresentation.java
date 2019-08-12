import java.util.*;

public class BinaryPresentation {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a;
            if(n == 0) {
                System.out.println(0);
            } else {
                String x = "";
                while(n > 0) {
                a = n % 2;
                n = n / 2;
                x = a + "" + x;          
            }
            System.out.println(x);
            }   
      } 
  } 
}