import java.util.Scanner;
class Pattern4Test {
    public static void main(String[] args) {
        int noOfCases =0;
        int patternSize = 0;
        Scanner in = new Scanner(System.in);
        noOfCases = in.nextInt();
        for( int cases = 1; cases <= noOfCases; cases++  ) {
            patternSize = in.nextInt();
            System.out.println("Case #"+ cases);
            for( int i=1; i<= patternSize;i++ ) {
                for( int j=patternSize-1; j >= i ; j-- ) {
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