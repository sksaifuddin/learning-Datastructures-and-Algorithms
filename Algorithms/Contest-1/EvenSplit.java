import java.util.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class EvenSplit {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main(String args[]) {
        FastReader sc=new FastReader();
        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) { 
          // start test case from here
         long num = sc.nextLong();
        //   BigInteger num = ; 

        //   System.out.println(num.testBit(0));

          if(num == 0) {
              System.out.println("Yes");
          } else {
            if((num & 0x01) == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
          }
            
        }
    }
}