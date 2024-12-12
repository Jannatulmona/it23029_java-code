// ict/22/ClassNames/MainClass.java
package ict.22.ClassNames;

public class MainClass {
    public static void main(String[] args) {
        // Call methods of SumClass
        double sum = SumClass.sumSeries();
        System.out.println("Sum of the series: " + sum);

        // Call methods of DivisorMultipleClass
        int gcd = DivisorMultipleClass.gcd(48, 180);
        int lcm = DivisorMultipleClass.lcm(48, 180);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        // Call methods of NumberConversionClass
        String binary = NumberConversionClass.decimalToBinary(45);
        String hex = NumberConversionClass.decimalToHexadecimal(45);
        String octal = NumberConversionClass.decimalToOctal(45);
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
        
        int binaryToDecimal = NumberConversionClass.binaryToDecimal(binary);
        int hexToDecimal = NumberConversionClass.hexadecimalToDecimal(hex);
        int octalToDecimal = NumberConversionClass.octalToDecimal(octal);
        System.out.println("Binary to Decimal: " + binaryToDecimal);
        System.out.println("Hexadecimal to Decimal: " + hexToDecimal);
        System.out.println("Octal to Decimal: " + octalToDecimal);

        // Call methods of CustomPrintClass
        CustomPrintClass.pr("Custom print method test!");
    }
}
