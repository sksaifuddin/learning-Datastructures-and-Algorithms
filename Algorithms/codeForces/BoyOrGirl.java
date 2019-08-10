import java.util.*;

public class BoyOrGirl {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      char nameArr[] = name.toCharArray();
      int dupCount = 0;
      int distinctCount = 0;
      for(int i=0; i<nameArr.length;i++) {
          for(int j=i+1; j<nameArr.length; j++) {
              if(nameArr[i] == nameArr[j]) {
                  dupCount++;
                  break;
              }
          }
      }
      distinctCount = name.length() - dupCount;
      if(distinctCount%2 == 0) {
          System.out.println("CHAT WITH HER!");
      } else {
          System.out.println("IGNORE HIM!");
      }
  } 
}