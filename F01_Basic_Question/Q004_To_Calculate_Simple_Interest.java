package F01_Basic_Question;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Q004_To_Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.print("Enter the value of P = ");
    int P = in.nextInt();
    System.out.print("Enter the value of r = ");
    int r = in.nextInt();
    System.out.print("Enter the value of t = ");
    int t = in.nextInt();
    int A = P*( 1 + r*t);
    System.out.println(" Simple_interest = " + A);
    }
    

}
