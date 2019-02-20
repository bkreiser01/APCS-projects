import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuess
{
    public static void main(String[] args)
    {
        //Create a scanner object to read in the user's input.
        Scanner keyboard = new Scanner(System.in);
        
        int difficulty = 1;

        //Have the user choose a difficulty.
        System.out.println("");
        System.out.println("Please choose a difficulty.");
        System.out.println("Beginner ~~~~~ [1]");
        System.out.println("Intermediate ~ [2]");
        System.out.println("Advanced ~~~~~ [3]");
        System.out.println("Master ~~~~~~~ [4]");
        System.out.print("Enter the number corrisponding to the difficulty ~> ");
        difficulty = keyboard.nextInt();

        int hints = 1;

        //Ask the user if they want hints or not.
        System.out.println("");
        System.out.println("Would you like to enable hints?");
        System.out.print("Enter 1 for Yes, or a 2 for No ~> ");
        hints = keyboard.nextInt();
   
        int firstRandomNumber = 0;
        int secondRandomNumber = 0;

        //Generate two random numbers, that the user must guess,according to the difficulty entered.
        if(difficulty == 1)
        {
            //Generate a random number between 1 - 11.
            firstRandomNumber = (int) ((Math.random() * 10) + 1);
            secondRandomNumber = (int) ((Math.random() * 10) + 1);
        }
        else if(difficulty == 2)
        {
            //Generate a random number between 1 - 101.
            firstRandomNumber = (int) ((Math.random() * 100) + 1);
            secondRandomNumber = (int) ((Math.random() * 100) + 1);
        }
        else if(difficulty == 3)
        {
            //Generate a random number between 1 - 1,001.
            firstRandomNumber = (int) ((Math.random() * 1000) + 1);
            secondRandomNumber = (int) ((Math.random() * 1000) + 1);
        }
        else if(difficulty == 4)
        {
            //Generate a random number between 1 - 10,001
            firstRandomNumber = (int) ((Math.random() * 10000) + 1);
            secondRandomNumber = (int) ((Math.random() * 10000) + 1);
        }
        
        boolean correctAnswer = false;
        int attempts = 0;
        
        //Tell user what the product and sum of the random numbers is.
        System.out.println("");
        System.out.println("I'm thinking of two numbers whose product is " + (firstRandomNumber * secondRandomNumber) + " and whose sum is " + (firstRandomNumber + secondRandomNumber) + ". Try to guess my numbers.");

        //If the user asked for hints, tell them a range of numbers that the mystery numbers were chosen from.
        if(hints == 1)
        {
            if(difficulty == 1)
                System.out.println("Each of these numbers are between 1 and 11.");

            else if(difficulty == 2)

                System.out.println("Each of these numbers are between 1 and 101.");   

            else if(difficulty == 3)       

                System.out.println("Each of these numbers are between 1 and 1,001.");    

            else if(difficulty == 4)        

                System.out.println("Each of these numbers are between 1 and 10,001.");
        }

        //Ask for attempts. If they are right the loop will end. Otherwise continue to loop until 3 attempts have been made.
        while(!correctAnswer && attempts < 3)
        {
            int firstInput, secondInput;
            
            System.out.println("You have " + (3 - attempts) + " attempt(s) to figure my numbers out.");
            System.out.println("");

            System.out.print("Please enter a number. ~> ");
            firstInput = keyboard.nextInt();
            System.out.print("Please enter another number. ~> ");
            secondInput = keyboard.nextInt();

            attempts = attempts + 1;

            //Compare input numbers with the random numbers. If they are correct. the loop will end. If they are wrong, tell them so.
            if(firstInput == firstRandomNumber && secondInput == secondRandomNumber || firstInput == secondRandomNumber && secondInput == firstRandomNumber)
                correctAnswer = true;
            else
            {
                System.out.println("");
                System.out.println("You were incorrect");

                //If the user wants hints run this.
                if (hints == 1)
                {
                    /*Compare first and second inputs to their corrisponding random number. 
                    Tell the user whether the numbers they entered were higher or lower than the random numbers.*/
                    if(firstInput > firstRandomNumber)
                        System.out.println("Your first input (" + firstInput + ") is greater than the first mystery number.");
                    else if(firstInput < firstRandomNumber)
                        System.out.println("Your first input (" + firstInput + ") is less than the first mystery number.");

                    if(secondInput > secondRandomNumber)
                        System.out.println("Your second input (" + secondInput + ") is greater than the second mystery number.");
                    else if(secondInput < secondRandomNumber)
                        System.out.println("Your second input (" + secondInput + ") is less than the second mystery number.");
                }
            }
        }

        //If their guess is right, tell them they got it correct. If their guess is wrong, tell them they got it wrong.
        if(correctAnswer == true)
            System.out.println("Congratulations! You were right. The numbers were " + firstRandomNumber + " and " + secondRandomNumber + ".");
        else
        {
            System.out.println("");
            System.out.println("The numbers were " + firstRandomNumber + " and " + secondRandomNumber + ".");
            System.out.println("Better luck next time.  >.<");
        }
    }
}