//Brandon Kreiser

import java.util.*;

public class Encryptor
{
    //This constant represents the maximum input length.
    private static final int MAX_SIZE = 10000000;

	private static void encryptAndOutput(char[][] inputArray)
	{
		int maxLength = 0;

		//Find the length of the longest word, and store that length.
		for(int i = 0; i < inputArray.length; i++)
		{
			if(inputArray[i].length > maxLength)
			{
				maxLength = inputArray[i].length;
			}
		}
		
		//Pass through the array twice
		for(int i = 0; i < 2; i++)
		{
			//Pass through each individual word and print the odd/even letter, according the the current pass number.
			for(int letter = i; letter < maxLength; letter += 2)
			{
				for(int word = 0; word < inputArray.length; word ++)
				{
					//If there are no more letters, print a tilde.
					if(letter >= inputArray[word].length)
						System.out.print('~');
					else
						System.out.print(inputArray[word][letter]);	
				}
			}
		}
	}

    ////////////////////////////////////////////////////////////	
	
	//Convert the input array to an array of words.  (This is a new
	//and improved version of the previous project.)
	private static char[][] convertToWords(char[] inputArray)
	{
	    int wordCount = 0;
		int wordStartPosition = 0;
		
	    //Count the number of words.  Note that i is incremented in the if and else,
		//rather than in the for loop header.
		for(int i = 0; i < inputArray.length; )
		    if(Character.isWhitespace(inputArray[i]))
			{
			    wordCount++;
				
				//Skip repeated white space.
				while(i < inputArray.length && Character.isWhitespace(inputArray[i]))
				    i++;
			}
			else
			    i++;
				
		//Allocate the array of words.
		char[][] outputArray = new char[wordCount][];
		
		//Now we'll use wordCount to tell which word we're on.  We can
		//always see the total number of words by using outputArray.length.
		wordCount = 0;
		
		//Go through the input array again, and when white space is encountered
		//allocate space for the next inner array.  Note that i is incremented in
		//the if and else, rather than in the for loop header.
		for(int i = 0; i < inputArray.length; )
		    if(Character.isWhitespace(inputArray[i]))
			{
			    //Allocate space for the current word.
			    outputArray[wordCount] = new char[i - wordStartPosition];
				
				//Skip repeated white space.
				while(i < inputArray.length && Character.isWhitespace(inputArray[i]))
				    i++;
				
				//Set the starting position of the next word.
				wordStartPosition = i;
				
				//Move on to the next word.
				wordCount++;
			}
			else
			    i++;
			
		wordCount = 0;
		int letterPosition = 0;
		
		//Go through the input array again, putting the letters of each word
		//into the inner arrays.  Note that i is incremented in the if and else, 
		//rather than in the for loop header.
		for(int i = 0; i < inputArray.length; )
		    //If a space is found, move on to the beginning of the next word.
		    if(Character.isWhitespace(inputArray[i]))
			{
			    letterPosition = 0;
				wordCount++;
				
				//Skip repeated white space.
				while(i < inputArray.length && Character.isWhitespace(inputArray[i]))
				    i++;
			}
			else
			{
			    outputArray[wordCount][letterPosition++] = inputArray[i];
				i++;
			}
				
		return outputArray;
	}
	
    public static void main(String[] args) throws java.io.IOException
    {
        int index = 0;
		char[] oversizedArray = new char[MAX_SIZE];

		//Read from the keyboard until the end of the input.
		int ch = System.in.read();
		
	    while(ch != -1)
		{
		    oversizedArray[index++] = (char)ch;
			ch = System.in.read();
        }
		    		
		//index equals the number of characters entered.
		//Now we can recover the extra space.
		char[] testArray = new char[index];
		
		//Copy the characters into the test array, stopping before the carriage return.
		for(int i = 0; i < index - 1; i++)
		    testArray[i] = oversizedArray[i];
			
		//Now put in the final space.  (This is needed for conversion.)
		testArray[index-1] = ' ';

		char[][] wordsArray = convertToWords(testArray);
		
        //Test print the words, one per line.
        //for(int i = 0; i < wordsArray.length; i++)
		//{
		//    for(int j = 0; j < wordsArray[i].length; j++)
		//	    System.out.print(wordsArray[i][j]);
		//		
		//	System.out.println();
		//}
		
		//Now output the encrypted words.
		encryptAndOutput(wordsArray);
	}
}