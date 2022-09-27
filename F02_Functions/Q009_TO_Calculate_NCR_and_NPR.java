package F02_Functions;

import java.util.Scanner;

public class Q010_TO_Calculate_NCR_and_NPR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of objects(n) = ");
        int n = in.nextInt();
        System.out.print("Enter no of object taken at a time(r) = ");
        int r = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            int A = fact;       
        }
        int num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * i; 
            int B = num;      
        }
        int num1 = 1;
        for (int i = 1; i <= (n-r); i++) {
            num1 = num1 * i; 
            int C = num1;        
        }
        int NPR = fact / num1;
        System.out.println("NPR =" + NPR); 
        int NCR = fact / (num * num1) ;
        System.out.println("NCR =" + NCR);   
    }    
}
