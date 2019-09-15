import java.util.*;
import java.io.*;

public class BinarySearch {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        int low = 0 ; int high = list.size() -1; int mid = 0;int key = 1;
        boolean found = false;
        while(low <= high) {
            mid = (low + high)/2;
            if(list.get(mid) == key) {
                System.out.println("index is at " + mid);
                found = true;
                break;
            } else if(list.get(mid) > key ) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if(found == false) {
            System.out.println("no element found");
        }
    }
}