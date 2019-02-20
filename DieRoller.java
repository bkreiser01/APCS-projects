import java.util.*;

public class DieRoller
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many dice?");
        int amountOfDice = keyboard.nextInt();        
        System.out.println();
        System.out.println("How many sides on each die?");
        keyboard = new Scanner(System.in);
        int sidesOnDice = keyboard.nextInt();
        System.out.println();
        System.out.println("============================================");

        System.out.println((int)(java.lang.Math.pow(sidesOnDice, amountOfDice)));
        keyboard.nextInt();

        int timesRolled = 0;
        boolean luckyRoll = false;

        for(int roll = 1; luckyRoll == false; roll++)
        {
            int total = 0;

            for(int rollDie = 1; rollDie <= amountOfDice; rollDie++)
            {
                Random rand = new Random();

                int random = rand.nextInt(sidesOnDice) + 1;
                System.out.println(random);

                total += random;
            }

            System.out.println();

            if(total == (sidesOnDice * amountOfDice))
                luckyRoll = true;

            timesRolled++;
        } 

        System.out.println();
        System.out.println(timesRolled);
    }
}