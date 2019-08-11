import java.util.*;

public class BeautifulMatrix {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int matrix[][] = new int[6][6];
      for(int i=0; i<5;i++) {
          for (int j = 0; i < 5; j++) {
              matrix[i][j] = sc.nextInt();
          }
      }
      for(int i=0; i<5;i++) {
        for (int j = 0; i < 5; j++) {
            if(j==5) {
                System.out.println(matrix[i][j]);
            } else {
                System.out.print(matrix[i][j]);
            }
        }
    }
         
  } 
}