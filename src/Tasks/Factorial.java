package Tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        long factorial = 1;
        if (num < 0) {
            System.out.println("Please enter a positive value");
        } else {
            for (int i = 1; i <= num; i++) {

                factorial = factorial * i;


            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
