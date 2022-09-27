package F01_Basic_Question;

import java.util.Scanner;

public class Q009_To_Find_Armstrong_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = in.nextInt();
        int ans = 0;
        while(num>0){
          int rem = num % 10;
            num = num / 10;
            ans = ans + rem*rem*rem;      
        } 
           if(ans == num){
            System.out.println("Armstrong");
           }else{
            System.out.println("Not Armstrong");
          }
          
        }
    }
    

