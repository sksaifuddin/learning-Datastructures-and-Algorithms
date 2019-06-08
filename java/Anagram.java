import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        boolean isAnagram = false;
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        char sortedA[] = a.toCharArray();
        char sortedB[] = b.toCharArray(); 
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);
        // if both lengths are not same then they are not anagrams , obviously duhh
        if( a.length() != b.length()) {
            System.out.println("Not Anagrams");
        } else {
           // compare sorted string
           for(int i=0;i< a.length(); i++) {
               if(sortedA[i] != sortedB[i]) {
                   isAnagram = false;
               } else {
                   isAnagram = true;
               }
           }
           if(isAnagram) {
               System.out.println("Anagrams");
           } else {
               System.out.println("Not Anagrams");
           }
        }
    }
}