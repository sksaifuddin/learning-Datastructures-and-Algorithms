import java.util.*;

public class TheatreSquare {
  public static void main(String args[]){
        java.util.Scanner sc = new Scanner(System.in);
        double n =  sc.nextDouble();
        double m = sc.nextDouble();
        double a = sc.nextDouble();
        double result = Math.ceil(n/a) * Math.ceil(m/a);
        System.out.println(Math.round(result));
  }
}