/ ict/22/ClassNames/DivisorMultipleClass.java
package ict.22.ClassNames;

public class DivisorMultipleClass {
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}