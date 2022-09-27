package F02_Functions;

import java.util.Scanner;

public class Q006_To_Calculate_Average_Of_N_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers = ");
        int n = in.nextInt();
        int Average = (n + 1)/2;
        System.out.print("Average of N numbers =" + Average);
    } 
}
