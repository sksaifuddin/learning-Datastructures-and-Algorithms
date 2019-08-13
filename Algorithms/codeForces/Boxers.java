import java.util.*;

public class Boxers {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int numberOfBoxers = sc.nextInt();
      int boxersList[] = new int[numberOfBoxers];
      int count = 0;
      for (int i = 0; i < numberOfBoxers; i++) {
          int boxerWeight = sc.nextInt();
          int dupCheckResult1 = checkIfDup(boxerWeight, boxersList);
          if( dupCheckResult1 != -1) {
                int boxerWeight2 = boxerWeight-1;
                int dupCheckResult2 = checkIfDup(boxerWeight2, boxersList);
                if(dupCheckResult2 == -1) {
                    if(boxerWeight2 != 0) {
                        boxersList[i] = boxerWeight2;
                        count++;
                    }
                } else {
                int boxerWeight3 = boxerWeight+1;
                int dupCheckResult3 = checkIfDup(boxerWeight3, boxersList);
                if(dupCheckResult3 == -1) {
                    if(boxerWeight3 != 0) {
                        boxersList[i] = boxerWeight3;
                        count++;
                    }
                }
                }
          }else {
              if(boxerWeight != 0) {
                boxersList[i] = boxerWeight;
                count++;
              }
          }
      }
      System.out.println(count);

  }
  
  public static int checkIfDup(int number, int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == number) {
            return arr[i];
        }
    }
    return -1;
  }
}