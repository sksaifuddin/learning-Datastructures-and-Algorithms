import java.util.*;

public class BonApetite {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      List<Integer> bill = new ArrayList<Integer>();
      bill.add(3);
      bill.add(10);
      bill.add(2);
      bill.add(9);
      int k = 1;
      int b = 7;
      int sum = 0;
      for (int i = 0; i < bill.size(); i++) {
          if(i != k) {
              sum += bill.get(i);
          }
      }
      int actualCharge = sum / 2;
      if(b > actualCharge) {
          System.out.println(b-actualCharge);
      } else if(b== actualCharge) {
          System.out.println("Bon Appetit");
      }
  } 
}