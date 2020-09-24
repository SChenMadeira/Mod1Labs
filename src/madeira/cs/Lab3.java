package madeira.cs;

import java.util.Scanner;

public class Lab3 {
    /*
        Corinna - 
        Good work here. For the first part, you're missing a few statements.
        For the second part, it'd be nice to know how you want the user to enter
        the month. For the last part, great job! An accurate calculation.
    */
    public static void main(String[] args) {
	 /*
           Instructions For Use
           ------
           Write a program that does the following
           I. Reads the user's age and prints if they're permitted to:
              a. Drive
	      b. Get a tattoo
              c. Run for President of the United States
           II. Reads the user's birthday month and prints:
              a. Their astrological sign
	      b. The season of said month
              c. The number of days in the month
           III. Prints the estimated value of their age in days.
       */

        // Part I code below
        Scanner MyAge = new Scanner(System.in);
        System.out.println("Enter Your age");
        int Age = MyAge.nextInt();
        if (Age >= 16) {
            System.out.println("You are permitted to drive");
        }
        else {
            System.out.println("You are not permitted to drive");
        }
        // Part II code below
        Scanner MyMonth = new Scanner(System.in);
        System.out.println("Enter Your birthday month");
        int Month = MyMonth.nextInt();
        if (Month == 1) {
            System.out.println("Capricorn");
        }
        if (Month == 2) {
            System.out.println("Aquarius");
        }
        if (Month == 3) {
            System.out.println("Pisces");
        }
        if (Month == 4) {
            System.out.println("Aries");
        }
        if (Month == 5) {
            System.out.println("Taurus");
        }
        if (Month == 6) {
            System.out.println("Gemini");
        }
        if (Month == 7) {
            System.out.println("Cancer");
        }
        if (Month == 8) {
            System.out.println("Leo");
        }
        if (Month == 9) {
            System.out.println("Virgo");
        }
        if (Month == 10) {
            System.out.println("Libra");
        }
        if (Month == 11) {
            System.out.println("Scorpio");
        }
        if (Month == 12) {
            System.out.println("Sagittarius");
        }
        // Part III code below
        Scanner MyBirthday = new Scanner(System.in);
        System.out.println("Enter Your birth year");
        int year = MyBirthday.nextInt();
        System.out.println("Enter Your birth day");
        int day = MyBirthday.nextInt();
        int result = (2020-year) * 365 + (9-Month) * 30 + 16 - day;
        System.out.println("Your age is "+result+" days!");
    }
}