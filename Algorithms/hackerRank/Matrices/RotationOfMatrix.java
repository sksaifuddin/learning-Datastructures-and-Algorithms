import java.util.*;

public class RotationOfMatrix {  
  
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int maxTest = 0; maxTest < t; maxTest++) {
        int size = sc.nextInt();
        int a[][] = new int[size][size];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt(); 
            }
        }

        //Find transpose
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++) {
                // swap(a[i][j], a[j][i]);
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // reverse the rows
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length / 2; i++) {
                int temp = a[j][i];
                a[j][i] = a[j][a[j].length - i - 1];
                a[j][a[j].length - i - 1] = temp;
            }
        }

        System.out.println("Test Case #"+(maxTest+1)+":");
        for (int i = 0; i < a.length; i++) 
        { 
            for (int j = 0; j < a.length; j++) 
            System.out.print(a[i][j] + " "); 
            System.out.print("\n"); 
        } 
    }
  }

}