import java.io.*; 
import java.util.*; 

public class PowerfulSubsets { 
       
    static int NUM_BITS = 31; 

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
       
    // Check for power of 2 or not 
    static boolean isPowerOf2(long num) 
    { 
        if(num != 0 && (num & (num - 1)) == 0) 
            return true; 
        return false; 
    } 
       
  
    static boolean checkSubsequence(long []arr, int n) 
    { 
           
        
        if (n == 1)  
            return isPowerOf2(arr[0]); 
       
      
        long total = 0; 
        for (int i = 0; i < NUM_BITS; i++) 
            total = total | (1 << i); 
       
     
        // for (int i = 0; i < NUM_BITS; i++) 
        // { 
       
        //     long ans = total; 
        //     for (int j = 0; j < n; j++)  
        //     { 
                
               
        //         long p = arr[j] & arr[i];  
        //         if (p == 0) 
        //             ans = ans & arr[j]; 
        //     } 
       
        
        //     if (isPowerOf2(ans))  
        //         return true; 
        // } 
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; i++) {
                res += arr[i] & arr[j];
            }
        }
             if (isPowerOf2(res))  
                return true; 
    
        return false; 
    } 
       
    public static void main(String args[]) 
    { 
        FastReader sc=new FastReader();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong(); 
            }
            if (checkSubsequence(arr, n)) 
                    System.out.println("YES"); 
                else
                    System.out.println("NO");
        }
    } 
} 