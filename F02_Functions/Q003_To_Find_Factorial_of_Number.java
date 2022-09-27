package F02_Functions;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Q003_To_Find_Factorial_of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = in.nextInt();
        int fact = 1;
        for(int i = 1; i<=num; i++) {
            fact = fact * i; 
        }
        System.out.println("Factorial =" + fact);
    }
}
