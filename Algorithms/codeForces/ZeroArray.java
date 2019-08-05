// http://codeforces.com/contest/1201/problem/B

import java.util.*;

public class ZeroArray {
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean nonZeroFlag = false;
        int[] values = new int[n];
        for(int i=0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        for(int i=0; i< values.length; i++) {
            for(int j=i+1; j< values.length; j++) {
                if(values[i] != 0 && values[j] !=0) {
                    while(values[i] != 0 && values[j] != 0) {
                        if(values[i] > 0) {
                            values[i] = values[i] - 1;
                        }
                        if(values[j] > 0) {
                            values[j] = values[j] - 1;
                        }
                    }
                }
            }
            if(values[i] != 0) {
                nonZeroFlag = true;
            } else {
                nonZeroFlag = false;
            }
        }

        if(nonZeroFlag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
  }
}