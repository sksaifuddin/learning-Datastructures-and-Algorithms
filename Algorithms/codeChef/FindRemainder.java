import java.util.*;

class FindRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int numOne = sc.nextInt();
            int numTwo = sc.nextInt();
            int result = numOne % numTwo;
            System.out.println(result);
        }
    }
}