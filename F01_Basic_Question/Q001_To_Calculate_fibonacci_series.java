package F01_Basic_Question;

import java.util.Scanner;

public class Q001_To_Calculate_fibonacci_series{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+", "+b+", ");
        for (int i = 0; i < n-2; i++) {
            int c = a+b;
            System.out.print( c+ ", ");
            a = b;
            b =c;
            
        }
    }
}