// ICP Minor Project Program 01

// There are 4 integers in successive memory locations in an array. 
// Write a program to rotate the 4 integers to the right by 2 bits according to the procedure given below. Print the original and
// resulting array in both integer and binary string form.
// To print binary string you can use the following library method:

// Integer.toBinaryString(s[i])

// Original array:
// 10 11 12 13

// Original array showing 32 bit binary value:
// 0000----------------1010 0000----------------1011 0000----------------1100 0000----------------1101

// After rotation array showing 32 bit binary value:
// 0100----------------0010 1000----------------0010 1100----------------0011 0000----------------0011

// After rotation array:
// 1073741826 -2147483646 -1073741821 3

// Use a method rotateRightBy2Bits() with the following header:
// public static void rotateRightBy2Bits(int s[])

// THE CODE BEGINS !!!

import java.util.*;
public class Problem1_RotateRight {
    public static void printArray(int[] arr, int n) {

        // Rotating the bits of each integer in the array :

        for (int i = 0; i <n; i++) {
            arr[i] = Integer.rotateRight(arr[i], 2);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Integer: " + arr[i] + ", Binary: " + Integer.toBinaryString(arr[i]));
        }
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array : "); 
        
        // this loop is for taking the input of arrays from user and showing the conversion of decimal to binary

        for(int i=0; i<n; i++){ 
            String bin="";
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" = ");
            bin=Integer.toBinaryString(arr[i]);
            System.out.print(bin);
            System.out.println();
        }  

        System.out.println("\nResulting array after rotating bits to the right by 2 places:");
        printArray(arr,n);
        sc.close();
    }
}
