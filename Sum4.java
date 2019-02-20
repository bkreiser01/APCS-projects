//Brandon Kreiser

public class Sum4
{
    public static void main(String [] args)
    {
        int finalSum = 0;
        int numberToAdd = 5;
        int incremnet = 2;

        //Increase the distance between the added terms by 1, then add the sum to the total sum.
        for(int loopCount = 1; loopCount <= 500; loopCount ++)
        {
            finalSum += numberToAdd;
            numberToAdd += incremnet;
            incremnet++;
        }

        System.out.println("The final sum is " + finalSum + ".");
    }
}