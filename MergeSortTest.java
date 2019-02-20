//Brandon Kreiser
import java.util.*;

public class MergeSortTest
{   
    public static void mergeSort(int[] array)
    {
        //Sort the array
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int start, int end)
    {
        if(start < end)
        {
            //Find the middle of the array.
            int middle = (start + end) / 2;

            //Use recusion to sort the first half of the array, then the second half.
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);

            //Combine the two sorted sections arrays into one completely sorted array.
            merge(array, start, middle, middle + 1, end);
        }
    }

    private static void merge(int[] array ,int start1 ,int end1 ,int start2 ,int end2)
    {
        int[] temp = new int[(end1 - start1) + (end2 - start2) + 2];
        int finger1 = start1;
        int finger2 = start2;
        int placeInTemp = 0;

        //Merge both halfs of the array into a temp array.
        while(finger1 <= end1 && finger2 <= end2)
        {
            
            //Compare the elements where finger one and finger 2 are, then copy the smallest into a temp array.
            if(array[finger1] < array[finger2])
            {
                temp[placeInTemp] = array[finger1];
                finger1++;
            }
            else
            {
                temp[placeInTemp] = array[finger2];
                finger2++;
            }
            
            placeInTemp++;        
        }
        
        //If there are any elements in either half of the array, copy them to a temp array. 
        while(finger1 <= end1)
        {
            temp[placeInTemp] = array[finger1];
            placeInTemp++;
            finger1++;
        }
        while(finger2 <= end2)
        {
            temp[placeInTemp] = array[finger2];
            placeInTemp++;
            finger2++;
        }

        placeInTemp = 0;

        //Copy the elements inside of the temp array to the original array.
        for(int i = start1; i <= end1; i++)
        {
            array[i] = temp[placeInTemp];
            placeInTemp++;
        }
        for(int i = start2; i <= end2; i++)
        {
            array[i] = temp[placeInTemp];
            placeInTemp++;
        }
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int numberOfNumbers = keyboard.nextInt();
        int[] numbersToSort = new int[numberOfNumbers];
     
        //Read in all the numbers.
        for(int i = 0; i < numberOfNumbers; i++)
            numbersToSort[i] = keyboard.nextInt();
            
        //Sort the numbers.
        mergeSort(numbersToSort);
        
        //Output all the numbers.
        for(int i = 0; i < numberOfNumbers; i++)
            System.out.print(numbersToSort[i] + " ");
    }
}