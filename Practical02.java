import java.util.Scanner;

public class Practical02 // declaring a public class  
{
    public static void main(String args[]) // main method that is entry point for the program
    {

    /* part 1: String Concatenation */

        Scanner scanner = new Scanner(System.in);   //Scanner object named scanner which reads inputs from the console  

        System.out.println("Enter your first name: "); 
        String firstname = scanner.nextLine(); // reads a line of text entered and stores in the variable

        System.out.println("Enter your middle name: ");
        String middlename = scanner.nextLine(); // reads a line of text entered and stores in the variable

        System.out.println("Enter your last name: ");
        String lastname = scanner.nextLine(); // reads a line of text entered and stores in the variable

        StringBuilder  stringbuilder = new StringBuilder(); // StringBuilder object which is effiecient for building strings through multiple additions 

        stringbuilder.append(lastname); // appends the lastname string to stringbuilder
        stringbuilder.append(firstname); // appends the firstname string to stringbuilder after the lastname
        stringbuilder.append(middlename); // appends the middlename string to stringbuilder after the firstname

        String result = stringbuilder.toString(); // converts the StringBuilder content to a string and assign it to the variable result   

        System.out.println("Full Name: " + result); 



    /*Part 2: String Comparison*/

    System.out.println("Enter another full name: ");
    String anotherfullname = scanner.nextLine();

    if (result.equalsIgnoreCase(anotherfullname)) // method to compare two strings ignoring their case  
    {
        System.out.println("both are same name");
    }
    else
    {
        System.out.println("both are different to each other");
    }

/*Part 3: String Modification */

String modifiedresult = result.replace('a','@') // replace method replaces a to @
                              .replace('e','3') // replace method replaces e to 3
                              .toUpperCase(); // toUpperCase method convert all letters to UpperCase

    System.out.println("modifiedresult: " +modifiedresult);                          


/* Part 4: String Splitting */

    String  parts = result.split(", ");
    
    }
}
