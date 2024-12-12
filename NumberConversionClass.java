// ict/22/ClassNames/NumberConversionClass.java
package ict.22.ClassNames;

public class NumberConversionClass {
    
    public static String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static String decimalToHexadecimal(int num) {
        return Integer.toHexString(num);
    }

    public static String decimalToOctal(int num) {
        return Integer.toOctalString(num);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
}
