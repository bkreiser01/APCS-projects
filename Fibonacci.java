public class Fibonacci
{
    public static void main(String [] args)
    {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 0;
        int total = 0;

        for(int count = 1; thirdNumber < 4000000; count++)
        {
            thirdNumber = firstNumber + secondNumber;

            if(count % 2 == 0)
            {
                total += thirdNumber;
            }

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            
        }

        System.out.println(total);
    }
}