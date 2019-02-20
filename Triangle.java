import java.util.*;

public class Triangle
{
    public static void makeTrangle(int n)
    {
        for(int line = 1; line <= n; line++)
        {
            for(int spaces = (line - 1); spaces >= 0; spaces--)
            {
                System.out.print(" ");
            }
            for(int stars = 2*(n - line); stars >= 0; stars--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        while (true)
        {
            Scanner userInput = new Scanner(System.in);

            int X = 1;

            System.out.print("Put in numbers dude. Youre gonna make a cool Triangle ~> ");
            X = userInput.nextInt();
            makeTrangle(X);
        }
    }
}