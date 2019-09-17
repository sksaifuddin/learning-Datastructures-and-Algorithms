
// https://www.hackerrank.com/contests/smart-interviews/challenges/si-pair-with-difference-k

import java.util.*;
import java.io.*;

public class PairWithDifference {
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
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            // logic starts from here
            boolean flag = false;
            for (int i = 0; i < n; i++) {
             long b =  arr[i] - k;
             // search for b(key) in the list using binary search;
             if(binarySearch(arr, b) == true) {
                flag = true;
                break;
             }
            }
            if(flag == true) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    static boolean binarySearch(long arr[], long k) {
        int low = 0; int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == k) {
                return true;
            } else if(arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}