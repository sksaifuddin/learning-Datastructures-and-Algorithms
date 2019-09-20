import java.util.*;

class ColorFullNumber {
  public static void main(String args[]) {
        int A = 3245;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(A != 0) {
            int num = A%10;
            numbers.add(num);
            A /= 10;
        }

        Collections.reverse(numbers);
         Collections.reverse(numbers);
    int n = numbers.size();

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int prod = 1;
            for (int k = i; k <= j; k++) {
                prod = prod * numbers.get(k);
            }
            if (hashSet.contains(prod))
                return 0;
            hashSet.add(prod);
        }
    }

  
    }
  }
}