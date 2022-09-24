package F01_Basic_Question;

import java.util.Scanner;

public class Q005_To_Make_a_Simple_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        System.out.print("Enter the num1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2 = ");
        int num2 = in.nextInt();
        System.out.print("Enter a valid operator = ");
        char op = in.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            if(op == '+' ){
                answer = num1 + num2;
            }
            if(op == '-' ){
                answer = num1 - num2;
        }
        if(op == '*' ){
            answer = num1 * num2;
    }
    if(op == '/' ){
        answer = num1 / num2;
    }
        System.out.println("value = " + answer);
        }
    }
}
    