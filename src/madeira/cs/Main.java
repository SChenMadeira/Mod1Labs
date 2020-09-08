package madeira.cs;

public class Main {

    public static void main(String[] args) {
	// write your code here
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


