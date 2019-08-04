import java.util.*;

public class StringTask {
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";
        for(int i=0; i< word.length(); i++) {
            char currentChar = word.charAt(i);
            String current = Character.toString(currentChar);
            if(!current.equals("A") && !current.equals("a")
            && !current.equals("O") && !current.equals("o")
            && !current.equals("Y") && !current.equals("y")
            && !current.equals("E") && !current.equals("e")
            && !current.equals("U") && !current.equals("u")
            && !current.equals("I") && !current.equals("i")
            ) {
                result += "." + current.toLowerCase();
            } 
        }
        System.out.println(result);
  }
}