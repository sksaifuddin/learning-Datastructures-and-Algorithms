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
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // logic starts from here
            boolean flag = false;
            for (int i = 0; i < n; i++) {
             int b = k - arr[i];
             // search for b(key) in the list using binary search;
             if(binarySearch(arr, b, i+1, arr.length-1) == true) {
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

    static boolean binarySearch(int arr[], int k, int low, int high) {
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