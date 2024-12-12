// ict/22/ClassNames/SumClass.java
package ict.22.ClassNames;

public class SumClass {
    public static double SeriesOfSum() {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            total += 1.0 / (i + 1);  // Sums 1 + 1/2 + 1/3 + ... + 1/101
        }
        return total;
    }
}