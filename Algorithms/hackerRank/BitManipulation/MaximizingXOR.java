import java.util.*;

public class MaximizingXOR {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int l =5; int r= 6;int max = 0;
      for (int i = l; i <= r; i++) {
            for(int k = l; k <= r; k++) {
                int xorValue = i ^ k;
                if(xorValue > max) {
                    max = xorValue;
                }
            }
       }
       System.out.println("xor"+ max);    
  } 
}