//Brandon Kreiser
public class CharArrayToWords
{
    public static char[][]charactersToWords(char[]sentence)
    {
        char[][]words;
        int spaceCount = 0;

        //Run through the arrary and count the spaces. The number of spaces is equal to the number of words.
        for(int i = 0; i < sentence.length; i++)
        {
            if(sentence[i]== ' ')
                spaceCount++;
        }
        words = new char[spaceCount][];

        int letterIndex = 0;
        int currentWordIndex = 0;

        //Run through the original sentence array to find the lengths of each word.
        for(int currentLetter = 0; currentLetter < sentence.length; currentLetter++)
        {
            if(sentence[currentLetter] != ' ')
                letterIndex++;
            else
            {
                words[currentWordIndex] = new char[letterIndex];
                letterIndex = 0;
                currentWordIndex++;
            }
        }
        currentWordIndex = 0;
        letterIndex = 0;
        int indexOfSentence = 0;

        //Transfer the words from the input array into the newly allocated array.
        while(indexOfSentence < sentence.length)
        {
            if(sentence[indexOfSentence] == ' ')
            {
                currentWordIndex++;
                letterIndex = 0;
            }
            else
            {
                words[currentWordIndex][letterIndex] = sentence[indexOfSentence];
                letterIndex++;
            }
            indexOfSentence++;
        }
        return words;
    }
    ////////////////////////////////////////////////////////////	
    public static void main(String[] args)
    {
        //Create some Strings so that we can easily create some arrays of chars.
		String string1 = "Here is a string to be split into words. ";
        String string2 = "another test string ";
        String string3 = "oneWord ";
        String string4 = "";  //Don't crash with this!

        //Now establish the arrays of chars used for testing the convert() method.
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        char[] charArray3 = string3.toCharArray();
        char[] charArray4 = string4.toCharArray();

        //Call the convert() method on each char array, storing the result.
		char[][] answer1 = charactersToWords(charArray1);
		char[][] answer2 = charactersToWords(charArray2);
		char[][] answer3 = charactersToWords(charArray3);
		char[][] answer4 = charactersToWords(charArray4);
    		
        //Test print the answers to see if the arrays were converted correctly.
        //The output should be one word per line from each original String.
        System.out.println("First String:");
        for(int i = 0; i < answer1.length; i++)
		{
		    for(int j = 0; j < answer1[i].length; j++)
			    System.out.print(answer1[i][j]);
				
			System.out.println();
		}

        System.out.println("Second String:");
        for(int i = 0; i < answer2.length; i++)
		{
		    for(int j = 0; j < answer2[i].length; j++)
			    System.out.print(answer2[i][j]);
				
			System.out.println();
		}

        System.out.println("Third String:");
        for(int i = 0; i < answer3.length; i++)
		{
		    for(int j = 0; j < answer3[i].length; j++)
			    System.out.print(answer3[i][j]);
				
			System.out.println();
		}

        System.out.println("Fourth String:");
        for(int i = 0; i < answer4.length; i++)
		{
		    for(int j = 0; j < answer4[i].length; j++)
			    System.out.print(answer4[i][j]);
				
			System.out.println();
		}
	}
}
