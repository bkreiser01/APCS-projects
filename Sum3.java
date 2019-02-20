//Brandon Kreiser

public class Sum3
{
    public static void main(String [] args)
    {
        int finalSum = 0;

        //Add each multiple of 6 (from 13 - 25,081) to the total.
        for(int loopCount = 13; loopCount <= 25081; loopCount +=6)
        {
            finalSum += loopCount;
        }

        System.out.println("");
        System.out.println("The sum of 25,081 multiples of 6, starting at 13, is " + finalSum + ".");
    }
}