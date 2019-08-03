import java.util.*;

public class WayTooLongWords {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();
    int testCaseNo = 1;
    while(testCaseNo <= testCases) {
        String word = sc.next();
        if(word.length() > 10) {
            char startingChar = word.charAt(0);
            char endingChar = word.charAt(word.length() - 1);
            int betweenChars = word.length()-2;
            System.out.println(startingChar +""+betweenChars+""+endingChar);
        } else {
            System.out.println(word);
        }
        testCaseNo++;
    }
  }
}