package F02_Functions;

import java.util.Scanner;

public class Q005_To_Calculate_Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of P = ");
        int P = in.nextInt();
        System.out.print("Enter the value of r = ");
        int r = in.nextInt();
        System.out.print("Enter the value of n = ");
        int n = in.nextInt();
        System.out.print("Enter the value of t = ");
        int t = in.nextInt();
        int A = ( P + P*r/n );
        int B = n*t;
        int C = 1;
        while(B > 0){
             C = C * A;
            B--;
        }       
        System.out.print("Compound Interest =" + C );
    }
}
