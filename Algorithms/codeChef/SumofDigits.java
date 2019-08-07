// https://www.codechef.com/problems/FLOW006

import java.util.*;

class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int num = sc.nextInt();
            int sum =0 ;
            while (num != 0) {
                // %10 gives the last digit of the number
                sum = sum + num % 10;
                // dividing it by 10 gives the remaning numbers
                num = num/10;
            }
        System.out.println(sum);
        }
    }
}