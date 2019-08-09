import java.util.*;

public class SmallestNumberOfNotes {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int[] arr = {1,2,5,10,50,100};
      for (int i = 0; i < t; i++) {
          int num = sc.nextInt();
          int result = 0;int count = 0;
          if(num == 1) {
              count = 0;
          } else {
            for (int j = arr.length-1; j >= 0; j--) {
                if(result != num) {
                    System.out.println(result+arr[j]);
                    while(result + arr[j] <= num) {
                            System.out.println("here");
                            count++;
                            result = result + arr[j];
                    }
                    System.out.println("result"+ result);
                }
            }
          }
          System.out.println(count);
      }    
  } 
}