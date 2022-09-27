package F02_Functions;

import java.util.Scanner;

import javax.security.auth.SubjectDomainCombiner;

public class Q001_To_Find_area_of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        int r = in.nextInt();
        double A = 3.14*r*r;
        System.out.print("Area of a circle =" + A);


    }
}
