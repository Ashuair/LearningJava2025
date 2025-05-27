package Tasks;

import java.util.Scanner;

//Write a Java program that takes a month number (1-12) and
// prints the number of days in that month using a switch statement. Handle February separately for leap years.
public class Switch_Month_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = sc.nextInt();
        System.out.println("Enter Year");
        int year= sc.nextInt();

        switch (month) {
            case 1:
            System.out.println("January - 31 Days");
            break;
            case 3:
                System.out.println("March - 31 Days");
            case 4:
                System.out.println("April - 30 ");
            case 5:
                System.out.println("May - 31");
            case 6:
                System.out.println("June - 30");
            case 7:
                System.out.println("July - 31");
            case 8:
                System.out.println("August - 31");
            case 9:
                System.out.println("September - 30");
            case 10:
                System.out.println("October - 31");
            case 11:
                System.out.println("November - 30");
            case 12:
                System.out.println("December - 31");

            case 2:
            {
                if((year%4==0&&year%100!=0)||year%400==0){
                    System.out.println("February - 29 Days");
                }
                else{
                    System.out.println("February - 28 Days");
                }
                      break;
            }
            default:
                System.out.println("Please enter valid month number");


        }

    }
}
