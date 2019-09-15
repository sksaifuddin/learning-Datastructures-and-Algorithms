import java.util.*;
import java.io.*;

public class CheckPalindrome {
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
          String original, reverse = "";
          int length = sc.nextInt();
          original = sc.nextLine();      
        for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))  
             System.out.println("Yes");  
        else  
             System.out.println("No");   
            }  
        }
    }