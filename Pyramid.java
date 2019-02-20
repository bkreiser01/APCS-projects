public class Pyramid
{
    public static void makeShape(int n)
    {
        int amountOfSpaces = n
        int amountOfStars = 1

        for(line = 1; line <= n; line++)
        {
            for(spaces = 0; spaces <= amountOfSpaces; spaces++)
            {
                System.out.print(" ");
            }

            for(stars = 0; stars <= amountOfStars; stars++)
            {
                System.out.print("*")
            }

            
        }
    }

    public static void main(String[] args)
    {
        makeShape(5)
    }
}