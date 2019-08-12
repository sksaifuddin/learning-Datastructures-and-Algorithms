import java.util.*;

public class MissingNumber {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int totalNumber = sc.nextInt();
          int max = 0;int sum = 0;int arr[] = new int[totalNumber];
          for (int j = 0; j < totalNumber; j++) {
            arr[j] = sc.nextInt();
            // sum += num;
            // if(max < num) {
            //     max = num;
            // }
          }
          Arrays.sort(arr);
          int index = 0;
          for (int k = 0; k < totalNumber-1; k++) {
            if(arr[k] != arr[k+1]) {
                System.out.println("here"+ arr[k]);
                arr[index++] = arr[k];
            }
          }
          arr[index++] = arr[totalNumber-1];
          for (int l = 0; l < arr.length; l++) {
              System.out.println(arr[l]);
              sum += arr[l];
          }
          int actualTotal = (arr[arr.length-1] * (arr[arr.length-1]+1)) / 2;
          int missingNnumber = Math.abs(actualTotal - sum);
          System.out.println(missingNnumber);
      } 
  } 
}