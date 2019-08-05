import java.util.*;
 
class AddTwoNumbers {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        System.out.println(numOne + numTwo );
    }
  }
}