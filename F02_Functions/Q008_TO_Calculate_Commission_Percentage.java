package F02_Functions;

import java.util.Scanner;

public class Q008_TO_Calculate_Commission_Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter commission price(A) = ");
        int A = in.nextInt();
        System.out.print("Enter purchase price(B) = ");
        int B = in.nextInt();
        float C = (A * 100)/B;
        System.out.print("Commission percentage =" + C);
    }
    
}
