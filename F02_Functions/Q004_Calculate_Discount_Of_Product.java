package F02_Functions;

import java.util.Scanner;

public class Q004_Calculate_Discount_Of_Product { 
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the List price = ");
       int L = in.nextInt();
       System.out.print("Enter the sell price = ");
       int s = in.nextInt();
       float D = (100*L - 100*s)/L;
       System.out.print("Discount Percentage =" + D);

    }


    }

