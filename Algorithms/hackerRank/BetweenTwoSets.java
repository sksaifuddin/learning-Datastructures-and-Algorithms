import java.util.ArrayList;

// HackerRank link :- https://www.hackerrank.com/challenges/between-two-sets/problem

class BetweenTwoSets {
  public static void main(String args[]){
        int a[] = {3,9,6};
        int b[] = {36,72};
        int min1 = a[0]; int max1 = a[0];
        int max2 = b[0]; int min2 = b[0];
        int max = 0; int min = 0;
        for(int i=1; i<a.length; i++) {
            if(max1 < a[i]) {
                max1 = a[i];
            }
            if(min1 > a[i]) {
                min1 = a[i];
            }
        }
        for(int i=1; i<b.length; i++) {
            if(max2 < b[i]) {
                max2 = b[i];
            }
            if(min2 > b[i]) {
                min2 = b[i];
            }
        }

        min = Math.min(min1, min2);
        max = Math.max(max1, max2);

        int finalCount = 0;
        for(int i=min; i<=max;i++) {
            int factor = 0; int firstFactorCount = 0;
            for(int j=0; j<a.length; j++) {
                if(i % a[j] == 0) {
                    firstFactorCount++;
                    factor = i;
                } else {
                    firstFactorCount = 0;
                    factor = 0;
                }
            }

        if(firstFactorCount == a.length) {
            if(factor != 0) {
                int secondFactorCount = 0;
                for(int k=0; k< b.length; k++) {
                    if(b[k] % factor == 0) {
                        secondFactorCount++;
                    } else {
                        secondFactorCount = 0;
                    }
                    if(secondFactorCount == b.length) {
                        finalCount++;
                    }
                }

            }
        }
    
        }
        System.out.println(finalCount);
  }
}

// Alternate solution from discussion:- O(n log(n)) solution.
// 1. find the LCM of all the integers of array A.
// 2. find the GCD of all the integers of array B.
// 3. Count the number of multiples of LCM that evenly divides the GCD.
