//Brandon Kreiser

public class Sum2
{
    public static void main(String [] args)
    {
        int finalSum = 0;

        //Add each multiple of 5 (from 5 - 25,000) to the total.
        for(int loopCount = 1; loopCount <= 25000; loopCount++)
        {
            finalSum += (loopCount * 5);
        }

        System.out.println("");
        System.out.println("The sum first 25,000 multiples of five is " + finalSum + ".");
    }
}