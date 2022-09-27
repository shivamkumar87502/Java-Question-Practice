package F02_Functions;

import java.util.Scanner;

public class Q007_TO_Calculate_Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of X1 = ");
        int X1 = in.nextInt();
        System.out.print("Enter the value of X2 = ");
        int X2 = in.nextInt();
        System.out.print("Enter the value of Y1 = ");
        int Y1 =in.nextInt(); 
        System.out.print("Enter the value of Y2 = ");
        int Y2 = in.nextInt();
        double A = (X1 - X2)* (X1 - X2) + (Y1 - Y2)* (Y1 - Y2);
        System.out.println("Distance =(" + A + ")=" + Math.sqrt(A));    
    }  
}
