import java.util.*;

public class StonesOnTable {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int noOfStones = sc.nextInt();
      String stones = sc.next();
      char stonesArr[] = stones.toCharArray();
      int removalStoneCount = 0;
      for (int i = 0; i < stonesArr.length-1; i++) {
           if(stonesArr[i] == stonesArr[i+1]) {
               removalStoneCount++;
           }
      }
      System.out.println(removalStoneCount);

  } 
}