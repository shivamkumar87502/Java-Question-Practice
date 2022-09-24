package F01_Basic_Question;

import java.util.Scanner;

public class Q002_TO_check_even_or_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        
    }
}
