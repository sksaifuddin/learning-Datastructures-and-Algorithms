import java.util.*;

class BirthdayChocolate {
  public static void main(String args[]){
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(2); list.add(2); list.add(1); list.add(3); list.add(2);
    int month = 2; int day = 4;
    int length = list.size();
    int numWays = 0, sum = 0;

    for(int i = 0 ; i <= (length - month) ; i++){
        for(int j = 0 ; j < month ; j++){
            sum = sum + list.get(j+i);
        }
        if(sum == day){
            numWays++;
        }
        sum = 0;
    }
    System.out.println("coun " + numWays);  
  }
}