import java.util.Scanner;

//Given an array of integers, find the sum of the elements of the given array. 

class SumOfArrays {
    public static void main(String[] args) {
        int noOfCases =0;
        int arraySize = 0;
        Scanner in = new Scanner(System.in);
        noOfCases = in.nextInt();
        for( int cases = 1; cases <= noOfCases; cases++  ) {
            int sumResult =0;
            arraySize = in.nextInt();
            int elements[] = new int[arraySize];
            for(int i=0; i<= (arraySize-1); i++) {
                elements[i] = in.nextInt();
            }
            for( int j=0; j<= (elements.length -1);j++) {
                sumResult += elements[j];
            }
            System.out.println(sumResult);
            
        }
        in.close();
    }
}