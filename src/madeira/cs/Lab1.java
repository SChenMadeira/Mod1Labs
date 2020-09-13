package madeira.cs;

/**
 * Author: Shuyang_Chen
 * Date: 9/3/2020
 **/
public class Lab1 {
   /*
      Great work, 10/10
    */
    public static void main(String[] args) {
       /*
         Instructions For Use
         ------
         Write a program that does the following
         I. Declare and instantiate three strings
            a. Print each string separately
         II. Re-assign a new value to the strings you declared
            a. Print the new strings separately
         III. Visit the link in the README.md section
            a. Find three string methods you like
            b. Use them however you so choose
       */

        // Part I code below
       String s1;
       s1 = "String1";
       System.out.println(s1);
       String s2;
       s2 = "String2";
       System.out.println(s2);
       String s3;
       s3 = "String3";
       System.out.println(s3);
        // Part II code below
       s1="NewString1";
       System.out.println(s1);
       s2="NewString2";
       System.out.println(s2);
       s3="NewString3";
       System.out.println(s3);
        // Part III code below
       System.out.println(s1.length());
       System.out.println(s1.replace("New", "Old"));
       System.out.println(s1.toLowerCase());

    }
}