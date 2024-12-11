public class NumberConversionClass {

    // Convert Binary to other number systems
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = binaryToDecimal(binary);
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return Integer.toOctalString(decimal);
    }

    // Convert Decimal to other number systems
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // Convert Hexadecimal to other number systems
    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String hexadecimalToBinary(String hex) {
        int decimal = hexadecimalToDecimal(hex);
        return Integer.toBinaryString(decimal);
    }

    public static String hexadecimalToOctal(String hex) {
        int decimal = hexadecimalToDecimal(hex);
        return Integer.toOctalString(decimal);
    }

    // Convert Octal to other number systems
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static String octalToBinary(String octal) {
        int decimal = octalToDecimal(octal);
        return Integer.toBinaryString(decimal);
    }

    public static String octalToHexadecimal(String octal) {
        int decimal = octalToDecimal(octal);
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static void main(String[] args) {
        // Example 
        String binary = "1101";
        int decimal = 13;
        String hex = "D";
        String octal = "15";

        // Binary conversions
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
        System.out.println("Binary to Hexadecimal: " + binaryToHexadecimal(binary));
        System.out.println("Binary to Octal: " + binaryToOctal(binary));

        // Decimal conversions
        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println("Decimal to Hexadecimal: " + decimalToHexadecimal(decimal));
        System.out.println("Decimal to Octal: " + decimalToOctal(decimal));

        // Hexadecimal conversions
        System.out.println("Hexadecimal to Decimal: " + hexadecimalToDecimal(hex));
        System.out.println("Hexadecimal to Binary: " + hexadecimalToBinary(hex));
        System.out.println("Hexadecimal to Octal: " + hexadecimalToOctal(hex));

        // Octal conversions
        System.out.println("Octal to Decimal: " + octalToDecimal(octal));
        System.out.println("Octal to Binary: " + octalToBinary(octal));
        System.out.println("Octal to Hexadecimal: " + octalToHexadecimal(octal));
    }
}
