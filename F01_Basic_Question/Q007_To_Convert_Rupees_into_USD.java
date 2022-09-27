package F01_Basic_Question;

import java.util.Scanner;

public class Q007_To_Convert_Rupees_into_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rupee = ");
        int rup = in.nextInt();
        double USD;
        USD = rup * (0.012);
        System.out.print("USD = " + USD);

    }
    
}
