import java.util.*;
import java.io.*;

public class FindCeil {
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

    static int ceilSearch(int arr[], int low, int high, int x) 
    { 
      int mid;     
      if(x <= arr[low]) 
        return low;  
    
      if(x > arr[high]) 
        return -1;   

      mid = (low + high)/2; 
       
      if(arr[mid] == x) 
        return mid; 
           
      else if(arr[mid] < x) 
      { 
        if(mid + 1 <= high && x <= arr[mid+1]) 
          return mid + 1; 
        else
          return ceilSearch(arr, mid+1, high, x); 
      } 
      else
      { 
        if(mid - 1 >= low && x > arr[mid-1]) 
          return mid; 
        else    
          return ceilSearch(arr, low, mid - 1, x); 
      } 
    } 
    public static void main(String args[]) {
        FastReader sc=new FastReader();
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }
          Arrays.sort(arr);
          int q = sc.nextInt();
          for (int i = 0; i < q; i++) {
              int x = sc.nextInt();
              int index = ceilSearch(arr, 0, n-1, x); 
            if(index == -1) 
            System.out.println(Integer.MAX_VALUE);
            else 
             System.out.println(arr[index]); 
          }
    }
}