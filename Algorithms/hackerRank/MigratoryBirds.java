import java.util.*;

public class MigratoryBirds {
  public static void main(String args[]) {
    List<Integer> arr=new ArrayList<Integer>();  
    arr.add(1);  
    arr.add(4);  
    arr.add(4);  
    arr.add(4);
    arr.add(5);
    arr.add(3);
    HashMap<Integer,Integer> birds=new HashMap<Integer,Integer>();  
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    for (int i = 0; i < arr.size();i++) {
        switch(arr.get(i)) {
            case 1: {
                count1++;
                birds.put(1, count1);
                break;
                }
            case 2: {
                count2++;
                birds.put(2, count2);
                break;
            }
            case 3: {
                count3++;
                birds.put(3, count3);
                break;
            }
            case 4: {
                count4++;
                birds.put(4, count4);
                break;
            }
            case 5: {
                count5++;
                birds.put(5, count5);
                break;
            }
        }
    }

    Map.Entry<Integer, Integer> maxEntry = null;

    for (Map.Entry<Integer, Integer> entry : birds.entrySet())
    {
        if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
        {
            maxEntry = entry;
        }
    }
    System.out.println(maxEntry.getKey());
  } 
}