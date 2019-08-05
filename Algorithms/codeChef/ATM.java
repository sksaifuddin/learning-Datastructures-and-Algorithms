import java.text.DecimalFormat;
import java.util.*;
 
class ATM {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int withdrawCash = sc.nextInt();
    double accountBalance = 0.00;
    accountBalance = sc.nextFloat();
    double finalBalance = 0.00;
    if(withdrawCash % 5 == 0) {
        if(withdrawCash+0.50 <= accountBalance) {
            finalBalance = accountBalance - withdrawCash - 0.50;
            System.out.println(String.format("%.2f", finalBalance));
        } else {
            System.out.println(String.format("%.2f",accountBalance));
        }
    } else {
        System.out.println(String.format("%.2f",accountBalance));
    }
  }
}