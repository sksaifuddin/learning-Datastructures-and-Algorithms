import java.util.*;

public class LuckyDivision {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      boolean flag = false;
    if(num != 0) {
      if(num % 4 == 0 || num % 7 ==0 || num % 47 == 0) {
          flag = true;
      } else {
          while(num != 0) {
              int rem = num % 10;
              if(rem != 4 && rem != 7) {
                  flag = false;
                  break;
              } else {
                  flag = true;
              }
              num = num/10;
          }
      }
      if(flag == true) {
          System.out.println("YES");
      } else {
          System.out.println("NO");
      }  
    } else {
        System.out.println("NO");
    } 
  } 
}