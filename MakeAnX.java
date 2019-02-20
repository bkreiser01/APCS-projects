import java.util.*;

public class MakeAnX
{
    public static void printX(int n)
    {
        for(int line = 1; line <= ((2*n)+1); line++)
        {
            for(int column = 1; column <= ((2*n)+1); column++)
            {
                if(column == line || column == ((2*n)+1) - (line - 1))
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }
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

            System.out.print("Put in numbers dude. Youre gonna make a cool X. ~> ");
            X = userInput.nextInt();
            printX(X);
        }
    }
}