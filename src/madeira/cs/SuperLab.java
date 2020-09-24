package madeira.cs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
		Gebrauchsanweisung
		-------
		Write a program that does the following
		I. Creates a new class named Artist.
			a. Artist should have 3 member variables
				(a)i. name
				(a)ii. album
				(a)iii. twitterHandle
				(a)iv. rating
		II. Creates 6 methods to set & get each of these values + 1 main method
		III. Uses the main method to open the text file artistList.txt
		IV. Constructs an Artist for each of the entries in the list & adds them to an Array
			a. This will require: reading the size of the list and constructing the list to match
		V. Print each artist entry
			a. Make sure that you've constructed a rating member too! This is not in the file!
	*/

public class SuperLab {
    public static void main(String[] args){
        try {
            File myObj =new File ("/Users/cccsssyyy/Downloads/artistList.txt");
            Scanner myReader=new Scanner(myObj);
            int numline = myReader.nextInt();
            String temp = myReader.nextLine();
            String[] artists = new String[numline];
            int counter=0;
            while (myReader.hasNextLine()) {
                artists[counter] = myReader.nextLine();
                counter ++;
            }
            myReader.close();


            Artist [] artists1 = new Artist[numline];
            counter=0;
            for (String line: artists) {
                artists1[counter].setName(line.split(",")[0]);
                artists1[counter].setName(line.split(",")[1]);
                artists1[counter].setName(line.split(",")[2]);
                /*
                line.split(",")[0];
                line.split(",")[1];
                line.split(",")[2];
                 */
                counter ++;
            }

            Scanner s=new Scanner(System.in);
            for (Artist line: artists1) {
                System.out.println("what do you think of" +artists1[0].getName()+"enter a rating");
                int rating=s.nextInt();
            }

            counter=0;
            for (Artist line: artists1) {
                System.out.println("the artist" +name+"enter a rating");
                int rating=s.nextInt();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

}

        class Artist {
            String name;
            String album;
            String twitterHandle;
            int rating;

            public Artist() {

                name = "n/a";
                album = "n/a";
                twitterHandle = "n/a";
                rating = 0;
            }
            public String getName() {return name;}
            public String getAlbum() {return album;}
            public String getTwitter() {return twitterHandle;}

            public void setName(String newName) {name=newName;}
            public void setAlbum(String newAlbum) {album=newAlbum;}
            public void setTwitter(String newTwitter) {twitterHandle=newTwitter;}

        }