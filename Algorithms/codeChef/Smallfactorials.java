// https://www.codechef.com/problems/FCTRL2

import java.util.*;
import java.math.BigInteger;  
 
class Smallfactorials {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
        int num = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        if(num == 0) {
            System.out.println(1);
        } else {
            for(int j=1; j<=num; j++){
                fact = fact.multiply(BigInteger.valueOf(j));
            }
            System.out.println(fact);
        }
    }
  }
}