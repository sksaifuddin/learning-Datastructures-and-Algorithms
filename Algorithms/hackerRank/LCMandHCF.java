import java.util.*;

public class LCMandHCF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            long a, b, x, y, t, hcf, lcm; 
		x = scan.nextLong();
		y = scan.nextLong();
		a = x;
		b = y;
 
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
 
        hcf = a;
		lcm = (x * y) / hcf;
 
		System.out.println(lcm+" "+ hcf);
        }
	}
}