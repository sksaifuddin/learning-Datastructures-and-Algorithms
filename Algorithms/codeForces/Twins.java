import java.util.*;

public class Twins {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int noOfCoins = sc.nextInt();
      int coinsArr[] = new int[noOfCoins];
      int sum = 0; int totalValue = 0;int count = 0;
      for (int i = 0; i < noOfCoins; i++) {
          coinsArr[i] = sc.nextInt();
          totalValue += coinsArr[i];
      }
      Arrays.sort(coinsArr);
      for (int i = 0; i < coinsArr.length; i++) {
          sum += coinsArr[i];
          count++;
          if(sum > (totalValue/2)) {
              break;
          }
      }
      System.out.println(count);
  } 
}