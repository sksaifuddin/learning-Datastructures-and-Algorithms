// https://www.hackerrank.com/contests/smart-interviews/challenges/si-tower-of-hanoi

import java.util.*;

public class TowerOfHanoi {
   static void towerOfHanoi(int n, char source, char destination, char aux) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move 1 from " +  source + " to " + destination); 
            return; 
        } 
        towerOfHanoi(n-1, source, aux, destination); 
        System.out.println("Move " + n + " from " +  source + " to " + destination); 
        towerOfHanoi(n-1, aux, destination, source);
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int n = sc.nextInt();
        int result = (int)(Math.pow(2, n)-1);
        System.out.println(result);
        towerOfHanoi(n, 'A', 'C', 'B');   
        }
    } 
}