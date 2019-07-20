import java.util.Scanner;

// Question : Implement Bubble Sort and print the total number of swaps involved to sort the array.

// Input Format:
// First line of input contains T - number of test cases. Its followed by 2T lines. 
// First line of each test case contains N - size of the array. 
// The next line contains N integers - elements of the array.

class BubbleSortQ1 {
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int i=1; i<= noOfTestCases; i++) {
            int sizeOfArray = sc.nextInt();
            int[] a = new int[sizeOfArray];
            // insert all the values in the array.
            for(int j=0; j<a.length; j++) {
                a[j] = sc.nextInt();
            }
            int swapCount = 0;
            for(int m=0; m< a.length; m++) {
                for(int n= 1; n< a.length-m; n++) {
                    if(a[n-1] > a[n]) {
                        int temp = a[n-1];
                        a[n-1] = a[n];
                        a[n] = temp;
                        swapCount++;
                    }
                }
            }
            System.out.println(swapCount);
        }

  }
}