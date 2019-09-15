// count first occurence and last occurence (lastOccurence - firstOccurence+1) = occurences;

import java.util.*;
import java.io.*;

public class CountOccurences {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 7, 7, 8, 8, 10));
        int low = 0 ; int high = list.size() -1; int mid = 0;int key = 25;
        int firstOccurence = -1; int lastOccurence = -1;
        while(low <= high) {
            mid = (low + high)/2;
            if(list.get(mid) == key) {
                firstOccurence = mid;
                high = mid-1;
            } else if(list.get(mid) < key ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = firstOccurence; high = list.size() -1 ;
        while(low <= high) {
            mid = (low + high)/2;
            if(list.get(mid) == key) {
                lastOccurence = mid;
                low = mid + 1;
            } else if(list.get(mid) < key ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("occurence " + lastOccurence + " " +firstOccurence);
        System.out.println(lastOccurence-firstOccurence+1);
        
    }
}