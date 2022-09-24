package F01_Basic_Question;

import java.util.Scanner;

public class Q006_To_Find_Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = in.nextInt();
        System.out.print("Enter second number = ");
        int num2 = in.nextInt();
        if(num1 > num2){
            System.out.println("The largest number = " + num1);
        }else{
            System.out.println("The largest number = " + num2);
        }
        

        }
       
    
}
