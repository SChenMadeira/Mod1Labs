package madeira.cs;

public class Main {

    public static void main(String[] args) {
        /*
        Exercise I
        ----------
        In Type I syntax (i.e. String [] list = {"item1", "item2"} construct an array of the planets which are:
        Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune and Pluto
        Yes, Pluto too, he's cute.
        Print out these planets with the cool new foreach loop
        a la: for (String listItem: myList )
        */
        String[] mylist = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        for (String listItem: mylist) {
            System.out.println(listItem);
        }

        /*
        Exercise II
        -----------
        Use syntax Type II (i.e. String [] myList = new String [i]) to make a list of #s 1-10
        Adding to the list should occur within a for loop & only take one line of code
        Once the list is constructed, print it out.
         */
        int [] numbers =new int [10];

        for (int i=0; i<10; i++) {
            numbers[i] = i;
        }

        for (int listItems: numbers) {
            System.out.println(listItems);
        }



    }
}


