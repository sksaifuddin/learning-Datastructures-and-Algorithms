import java.util.*;

public class PickingNumbers {
  public static void main(String args[]) {
    List<Integer> a=new ArrayList<Integer>();  
    a.add(1);  
    a.add(2);  
    a.add(2);  
    a.add(3);
    a.add(1);
    a.add(2);
    int arr[] = new int[a.size()];
    int count = 0;int checkCount = a.size()-1;
    for (int i = 0; i < a.size(); i++) {
        for (int j = i+1; j < a.size();j++) {
            if((a.get(i) - a.get(j)) <= 1) {
                count++;
            }
        }
        if(count == checkCount) {
            arr[i] = a.get(i);
        }
        checkCount--;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
  } 
}