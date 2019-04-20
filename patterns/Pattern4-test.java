import java.util.Scanner;
class Pattern4Test {
    public static void main(String[] args) {
        int noOfCases =0;
        Scanner in = new Scanner(System.in);
        noOfCases = in.nextInt();
        int casesArray[] = new int[noOfCases];
        for(int i = 0; i < noOfCases; i++) {
            casesArray[i] = in.nextInt();
        }
        // completed getting the inputs

        for( int cases = 0; cases < casesArray.length; cases++ ) {
            int sampleCase = casesArray[cases];
            System.out.println("Case #" + (cases+1));
            for( int i=1; i<=sampleCase;i++ ) {
                for( int j=(sampleCase-1); j >= i ; j-- ) {
                    System.out.print(" ");
                }
                for( int k=1; k<=i; k++ ) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        

    }
}