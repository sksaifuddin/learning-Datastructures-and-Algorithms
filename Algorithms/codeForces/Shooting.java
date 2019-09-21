import java.util.*;
import java.io.*;

public class Shooting {
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
        int noOfCans = sc.nextInt();
        // int cans[] = new int[noOfCans];
        ArrayList<Integer> cans = new ArrayList<Integer>();
        for (int i = 0; i < noOfCans; i++) {
            // cans[i] = sc.nextInt();
            cans.add(sc.nextInt());
        }
        int count[] = new int[noOfCans];
        ArrayList<Integer> cans1 = new ArrayList<Integer>();
        // cans1 = cans.clone();
        cans1 = new ArrayList<Integer>(cans);
        int noOfShots = 0;
        for (int i = 0; i < noOfCans; i++) {
            int smallest = smallest(cans1);
            noOfShots = (smallest*i) + 1;
            count[i] = cans.indexOf(smallest);
            cans1.remove(smallest);

        }
        System.out.println(noOfShots);

    }

    public static int smallest(ArrayList<Integer> cans) {
        Collections.sort(cans);
        int element = cans.get(cans.size()-1);
        return element;  
    }
}