//Brandon Kreiser

public class Sum1
{
    public static void main(String [] args)
    {
        int finalSum = 0;

        //Add each positive integer from 1 - 50,000 to the total.
        for(int loopCount = 1; loopCount <= 500; loopCount++)
        {
            System.out.println(finalSum);
            finalSum += loopCount;
        }
        System.out.println("");
        System.out.println("The sum of 50,000 integers is " + finalSum + ".");
    }
}