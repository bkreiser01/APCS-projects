//Brandon Kreiser
import java.util.*;
public class UserIntegerSorter
{
    private static void bubbleSort(int[] numbersToSort)
    {
        //Do enough passes to sort the entire array.
        for(int passCount = 1; passCount <= (numbersToSort.length - 1); passCount++)

            //Make one pass through the array.
            for(int arrayIndex = 0; arrayIndex < numbersToSort.length - 1; arrayIndex++)

                //If adjacent elements are are out of order, swap them.
                if(numbersToSort[arrayIndex] > numbersToSort[arrayIndex + 1])
                {
                    int temp = numbersToSort[arrayIndex];
                    numbersToSort[arrayIndex] = numbersToSort[arrayIndex + 1];
                    numbersToSort[arrayIndex + 1] = temp;
                }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        //
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.print("This program sorts all of the numbers you enter. How many numbers would you like to sort?  ");
        int amountOfNumbersToSort = keyboard.nextInt();

        //
        int[] inputtedNumbers = new int[amountOfNumbersToSort];

        //
        System.out.println("Enter the numbers you would like to sort right next each arrow.")
        for(int arrayIndex = 0; arrayIndex < amountOfNumbersToSort; arrayIndex++)
        {
            System.out.print("#" + (arrayIndex + 1) + " ~> ");
            inputtedNumbers[arrayIndex] = keyboard.nextInt();
        }
        
        //
        bubbleSort(inputtedNumbers);

        //
        for(int arrayIndex = 0; arrayIndex < amountOfNumbersToSort; arrayIndex++)
            System.out.print(inputtedNumbers[arrayIndex] + " ");
        System.out.println(); 
    }
}