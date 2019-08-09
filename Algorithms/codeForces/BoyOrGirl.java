import java.util.*;

public class BoyOrGirl {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      char nameArr[] = name.toCharArray();
      for(int i=0; i<nameArr.length;i++) {
          for(int j=i; j<nameArr.length; j++) {
              if(nameArr[i] == nameArr[j]) {
                  nameArr[j] = nameArr[j++];
              }
          }
      }
      for (int i = 0; i < nameArr.length; i++) {
          System.out.println(nameArr[i]);
      }
  } 
}