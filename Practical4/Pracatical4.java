import java.util.Scanner;
class Practical4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Select Conversion")
System.out.println("Decimal to binary");
System.out.println("Decimal to octal");
System.out.println("Decimal to Hexa");
System.out.println("Binary to decimal");
System.out.println("Binary to octal");
System.out.println("Binary to Hexa");
System.out.println("Octal to decimal");
System.out.println("Ocatal to binary");
System.out.println("Octal to Hexa");
System.out.println("Hexa to decimal");
System.out.println("Hexa to binary");
System.out.println("Hexa to ocatal");
int choice = sc.nextInt();
System.out.println("Enter the number:");
String input = sc.next();
switch (choice) {
            case 1:
                System.out.println("Binary: " + decimaltoBinary(input));
                break;
            case 2:
                System.out.println("Octal: " + decimalToOctal(input));
                break;
            case 3:
                System.out.println("Hexadecimal: " + decimalToHexadecimal(input));
                break;
            case 4:
                System.out.println("Decimal: " + binaryToDecimal(input));
                break;
            case 5:
                System.out.println("Octal: " + binaryToOctal(input));
                break;
            case 6:
                System.out.println("Hexadecimal: " + binaryToHexadecimal(input));
                break;
            case 7:
                System.out.println("Decimal: " + octalToDecimal(input));
                break;
            case 8:
                System.out.println("Binary: " + octalToBinary(input));
                break;
            case 9:
                System.out.println("Hexadecimal: " + octalToHexadecimal(input));
                break;
            case 10:
                System.out.println("Decimal: " + hexadecimalToDecimal(input));
                break;
            case 11:
                System.out.println("Binary: " + hexadecimalToBinary(input));
                break;
            case 12:
                System.out.println("Octal: " + hexadecimalToOctal(input));
                break;
                case 13:
                System.out.println("Byte: " + getByte(Integer.parseInt(input)));
                break;
            case 14:
                System.out.println("Short: " + getShort(Integer.parseInt(input)));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static String decimaltoBinary(String num) {
        int decimal = Integer.parseInt(num);
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static String decimaltoOctal(String num) {
        int decimal = Integer.parseInt(num);
        String octal = "";
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal = decimal / 8;
        }
        return octal;
    }

    public static String decimalToHexadecimal(String num) {
        int decimal = Integer.parseInt(num);
        String x = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            x = hexChars[decimal % 16] + x;
            decimal = decimal / 16;
        }
        return x;
    }

    public static String binaryToDecimal(String binaryString) {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(binaryString.length() - 1 - i);
            decimal += (bit - '0') * Math.pow(2, i);
        }
        return String.valueOf(decimal);
    }

    public static String binaryToOctal(String binaryString) {
        int decimal = Integer.parseInt(binaryToDecimal(binaryString));
        return decimaltoOctal(String.valueOf(decimal));
    }
    public static String binaryToHexadecimal(String binaryString) {
        int decimal = Integer.parseInt(binaryToDecimal(binaryString));
        return decimalToHexadecimal(String.valueOf(decimal));
    }
    public static String octalToDecimal(String octalString) {
        int decimal = 0;
        for (int i = 0; i < octalString.length(); i++) {
            char digit = octalString.charAt(octalString.length() - 1 - i);
            decimal += (digit - '0') * Math.pow(8, i);
        }
        return String.valueOf(decimal);
    }
    public static String octalToBinary(String octalString) {
        int decimal = Integer.parseInt(octalToDecimal(octalString));
        return decimalToBinary(String.valueOf(decimal));
    }
    public static String octalToHexadecimal(String octalString) {
        int decimal = Integer.parseInt(octalToDecimal(octalString));
        return decimalToHexadecimal(String.valueOf(decimal));
    }
    public static String hexadecimalToDecimal(String hexString) {
        int decimal = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexDigit = hexString.charAt(hexString.length() - 1 - i);
            int value = (hexDigit >= '0' && hexDigit <= '9') ? (hexDigit - '0') : (hexDigit - 'A' + 10);
            decimal += value * Math.pow(16, i);
        }
        return String.valueOf(decimal);
        }
public static String hexadecimalToBinary(String hexString) {
        int decimal = Integer.parseInt(hexadecimalToDecimal(hexString));
        return decimalToBinary(String.valueOf(decimal));
    }
 public static String hexadecimalToOctal(String hexString) {
        int decimal = Integer.parseInt(hexadecimalToDecimal(hexString));
        return decimalToOctal(String.valueOf(decimal));
    }}
    public int getByte(int num){
    int answer;
    if(num>= -128 && num<=127){
    answer=num;}
    else if(num< -128){
    answer=((num+128)%256)-128;}
    else{
    answer=((num+128)%256)-128;}
    return answer;}
    public static int getShort(int num){
    int result;
    if(num>= -32768 && num<=32767){
    result=num;}
    else if(num< -32768){
    result=((num+32768)%65536)-32768;}
    else{
    result=((num+32768)%65536)-32768;}
    return result;
    }
    public static int getNumber(int num,String type){
    if("byte".equalsIgnoreCase(type){
    return ((num+128)%256)-128;}
    else if("short".equalsIgnoreCase(type){
    return ((num+32768)%65536)-32768;}
    else{
    "Invalid"}
    }
    
    
    
    
