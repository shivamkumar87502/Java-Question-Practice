package F02_Functions;

import java.util.Scanner;

public class Q002_To_Find_Volume_of_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of radius = ");
        int r = in.nextInt();
        System.out.print("Enter the value of height = ");
        int h = in.nextInt();
        double V = (3.14*r*r*h)/3;
        System.out.println("Volume of cone =" + V);
    }
    
}
