import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        String result = "";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        for(int i = A.length()-1; i>=0;i--) {
            result = result+ A.charAt(i);
        }
        if(result.equalsIgnoreCase(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}