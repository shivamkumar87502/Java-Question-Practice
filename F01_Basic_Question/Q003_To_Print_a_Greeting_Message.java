package F01_Basic_Question;

import java.util.Scanner;

public class Q003_To_Print_a_Greeting_Message {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
    
}
