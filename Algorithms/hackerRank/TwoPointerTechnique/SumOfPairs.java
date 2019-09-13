import java.util.*;
import java.io.*;

public class SumOfPairs {

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
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int p1=0; int p2=n-1; boolean flag = false;
            while(p1 < p2) {
                if(arr[p1] + arr[p2] == k) {
                    flag = true;
                    break;
                } else if(arr[p1] + arr[p2] < k) {
                    p1++;
                } else {
                    p2--;
                }
            }
        if(flag == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
      }    
  } 
}