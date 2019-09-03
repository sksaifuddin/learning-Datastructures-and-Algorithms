import java.util.*;

public class Subset {


    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        output.add(new ArrayList<Integer>());
        if (a.size() == 0) {
            return output;
        }
        
        Collections.sort(a);
        generate(a, output, new ArrayList<Integer>(), 0);
        return output;
    }
    
    public static void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index) {
        for (int i = index; i < a.size(); i++) {
            temp.add(a.get(i));
            output.add(new ArrayList<Integer>(temp));
            generate(a, output, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }

  public static void main(String args[]) {
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();    
    A.add(1); A.add(2);  A.add(3);
    result = subsets(A);
    for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
    } 

  } 
}