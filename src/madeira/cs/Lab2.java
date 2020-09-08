package madeira.cs;
import java.util.Scanner;
/**
 * Author: YOUR_NAME
 * Date: 1/1/1970
 **/
public class Lab2 {
    public static void main(String[] args) {
        /*
            Instructions for Use
            ----
            Write a program that does the following
                I. Read your name
                    a. Print a greeting
                II. Read your favorite artist or author
                    a. Print your favorite song or book by that artist
                III. Read your age
                    a. Print the number of days you've been alive (an estimate is fine)
         */
        // Part I code below
        Scanner MyName = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String Name = MyName.nextLine();
        System.out.println("Hello, " + Name);
        // Part II code below
        Scanner FavoriteArtist = new Scanner(System.in);
        System.out.println("Enter Your Favorite Artist");
        String Artist = FavoriteArtist.nextLine();
        System.out.println("My favorite song is Cradles by " + Artist);
        // Part III code below
        Scanner MyAge = new Scanner(System.in);
        System.out.println("Enter Your age");
        String Age = MyAge.nextLine();
        System.out.println();
    }
}