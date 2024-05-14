// ICP Minor Project Program 02

// Given a decimal integer (n) and base value (b). 
// Write a Java program to convert n to the corresponding target value n’ such that: (n)10 = (n’)b

// [As the target value may contain both alphabets and digits, it is better to use String]

// Use a method convertToAnyBase() with the following header:

// public static String convertToAnyBase(int n, int b)

// THE CODE BEGINS !!!

import java.util.*;
public class Problem2_ConvertToAnyBase {
    public static String convertToAnyBase(int n, int b) {
        // Define the characters for digits greater than 9
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        if (n == 0) {
            return "0";
        }

        String result = "";
        while (n > 0) {
            result = digits[n % b] + result;
            n = n/b;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the base value : ");
        int b =sc.nextInt();
        System.out.print("Enter the integer value : ");
        int n =sc.nextInt();
        String result = convertToAnyBase(n, b);
        System.out.println("The base " + b + " and the integer is " + n + "\nThe targetting value : " + result);
        sc.close();
    }
}
