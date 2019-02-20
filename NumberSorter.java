//Brandon Kreiser
import java.util.*;
public class NumberSorter
{
    private static void insertionSort(int[] numbersToSort)
    {
        //Pass through the entire array.
        for(int firstUnsortedElement = 0; firstUnsortedElement < numbersToSort.length; firstUnsortedElement++)
        {
            int elementToBeInserted = numbersToSort[firstUnsortedElement];
            int correctPositionSeeker = firstUnsortedElement - 1;
            
            //Pass through the sorted section of the array until the correct position is found.
            while(correctPositionSeeker >= 0 && numbersToSort[correctPositionSeeker] > elementToBeInserted)
            {
                //Replace the element to the right of the current element with the current element.
                numbersToSort[correctPositionSeeker + 1] = numbersToSort[correctPositionSeeker];
                correctPositionSeeker--;
            }

            //Put the element to be inserted into the correct position.
            numbersToSort[correctPositionSeeker + 1] = elementToBeInserted;
              
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
        insertionSort(inputtedNumbers);
        
        //Display the sorted numbers.
        System.out.print("Your numbers, when sorted from smallest to largest, appear as such: ");
        for(int arrayIndex = 0; arrayIndex < amountOfNumbersToSort; arrayIndex++)
            System.out.print(inputtedNumbers[arrayIndex] + " ");
        System.out.println();
    }
    
}