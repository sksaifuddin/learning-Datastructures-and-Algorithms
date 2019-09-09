import java.util.*;

public class IntersectionNumbers {
  public static void main(String args[]) {
    ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10000000));
    ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(10000000));
    ArrayList<Integer> res = new ArrayList<Integer>();
    int p1 = 0; int p2=0;
    while(p1 < a.size() && p2 < b.size()) {
        if(a.get(p1).equals(b.get(p2)) ) {
            res.add(b.get(p2));
            p1++; p2++;
        }  else if (a.get(p1) > b.get(p2)) {
            p2++;
        }
        else {
            p1++;
        }
    }
  } 
}