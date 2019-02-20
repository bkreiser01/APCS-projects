//Brandon Kreiser
import java.util.*;
public class UserIntegerSorter2
{
    private static void sortNumbers(int[] numbersToSort)
    {
        //From beginning to end, fill each cell of the array with its correct element.
        for(int positionToBeFilled = 0; positionToBeFilled < numbersToSort.length; positionToBeFilled++)
        {
            int minimumElementIndexSeeker = positionToBeFilled;

            //Pass through the incorrectly filled cells of the array, and seek the minimum element.
            for(int currentPositionBeingTested = positionToBeFilled + 1; currentPositionBeingTested < numbersToSort.length; currentPositionBeingTested++)

                //If you find a new minimum is found, update the information about the previous minimum.
                if(numbersToSort[currentPositionBeingTested] < numbersToSort [minimumElementIndexSeeker])
                    minimumElementIndexSeeker = currentPositionBeingTested;

            //Swap the current minimum element into the first incorrectly filled cell.
            int temp = numbersToSort[positionToBeFilled];
            numbersToSort[positionToBeFilled] = numbersToSort[minimumElementIndexSeeker];
            numbersToSort[minimumElementIndexSeeker] = temp;
        }
    }

    public static void main(String[] args)
    {
        //Create a Scanner object to read the user's input.
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user to input the desired amount of numbers to sort.
        System.out.print("This program sorts numbers inputted by the user. Enter how many numbers you would like sorted here ~> ");
        int amountOfNumbersToSort = keyboard.nextInt();
        
        //Create an array the same size as the previously inputted value.
        int[] inputtedNumbers = new int[amountOfNumbersToSort];
        
        //Allow the user to input the numbers they would like to sort.
        System.out.println("Enter each number you would like to sort next to each arrow.");
        for(int arrayIndex = 0; arrayIndex < amountOfNumbersToSort; arrayIndex++)
        {
            System.out.print("Enter number " + (arrayIndex + 1) + " ==> ");
            inputtedNumbers[arrayIndex] = keyboard.nextInt();
        }
        
        //Sort the array.
        sortNumbers(inputtedNumbers);
        
        //Display the sorted numbers.
        System.out.print("Your numbers, when sorted from smallest to largest, appear as such: ");
        for(int arrayIndex = 0; arrayIndex < amountOfNumbersToSort; arrayIndex++)
            System.out.print(inputtedNumbers[arrayIndex] + " ");
        System.out.println();
    }
    
}