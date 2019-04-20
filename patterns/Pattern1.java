// Pattern - 1
// *
// **
// ***
// ****

class Pattern1 {
    public static void main(String[] args) {
        // loop for rows
        for( int i=1; i<=4; i++ ) {
            // loop for columns
            for( int j=1; j<=i; j++  ) {
                System.out.print('*');
            }
            System.out.println();
         }    
    }
}