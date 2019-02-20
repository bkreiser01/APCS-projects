//Brandon Kreiser
import java.util.*;

public class WrapAround
{
    public static void main(String [] args) throws java.io.IOException
    {
        //Create a Scanner object to read the user's input.
        Scanner keyboard = new Scanner(System.in);

        //Ask the user to enter the desired amount of characters.
        System.out.println("How many characters do you want to enter?");
        int amountOfWantedCharacters = keyboard.nextInt();

        //Ask the user to input their desired characters.
        char[] userInputCharacters = new char[amountOfWantedCharacters];
        System.out.println("Please enter your " + amountOfWantedCharacters + " characters.");

        //Read the users input and store each character of the input in an array.
        for(int i = 0; i < amountOfWantedCharacters; i++)
            userInputCharacters[i] = (char)System.in.read();

        //Ask the user which character to display first accroding to its index in the array.
        System.out.println("Which character do you want to start with?");
        keyboard = new Scanner(System.in);
        int characterToStartWith = keyboard.nextInt();

        //Display all characters in the array. Starting with the index the user specified.
        System.out.println("Here are all of your characters, beginning with " + characterToStartWith);
        System.out.print(userInputCharacters[characterToStartWith - 1]);
        for(int i = characterToStartWith + 1 ; i != characterToStartWith; i++)
        {
            System.out.print(userInputCharacters[i - 1]);
            if (i == userInputCharacters.length)
                i = 0;
        }
    }
}