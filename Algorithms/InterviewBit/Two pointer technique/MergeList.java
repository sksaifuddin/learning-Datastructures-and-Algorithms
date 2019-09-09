import java.util.*;

public class MergeList {
  public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(6);a.add(8);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(2);b.add(3);
        int p1 = 0; int p2 = 0;
        while(p1 < a.size() && p2 < b.size()) {
            if(a.get(p1) > b.get(p2)) {
                a.add(p1, b.get(p2));
                p1++; p2++;
            } else {
               p1++;
            }
            
        }

            while(p2 < b.size()) {
                a.add(p1, b.get(p2));
                p2++;
            }
          
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }
  } 
}