public class Multiples
{
    public static void main(String[] args)
    {   
        int total = 0;

        for(int count = 1; count < 1000; count++)
        {
            if((count % 3 == 0) || (count % 5 == 0))
            {
                total += count;
            }
        }
        System.out.println(total);
    }
}