import java.util.*;

public class PowerOfTwo {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();boolean powerFlag = true;
      for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            if(num == 0) {
                System.out.println("False");
            } else
                // while(num != 1) {
                //     if(num %2 != 0) {
                //         powerFlag = false;
                //         break;
                //     }
                //     num = num/2;
                // }
                // if(powerFlag == true) {
                //     System.out.println("True");
                // } else {
                //     System.out.println("False");
                // }
                if(num!=0 && ((num&(num-1)) == 0)){
                    System.out.println("True");
                } else{ 
                    System.out.println("False"); 
                }
      }  
  } 
}