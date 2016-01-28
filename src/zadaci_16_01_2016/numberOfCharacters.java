package zadaci_16_01_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/*
 * 3. Napišite program koji će brojati broj karaktera, riječi i linija teksta u nekom fileu. 
 * Riječi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao
 *  argument u vaš program. (Ovo je text koji ću jakoristiti za testiranje, ukoliko nema ideja)
 */
public class numberOfCharacters
{

	public static void main(String[] args) throws IOException 
	{
		//StartCopyCode source http://stackoverflow.com/questions/18274391/count-characters-words-and-lines-in-file
		int charsCount = 0; //brojac charaktera
		int wordsCount = 0; //brojac rijecih
		int linesCount = 0; //brojac linija
		
		Scanner fileScanner = null; //inicijalizacija scannera na 0
		File selectedFile = null; // inicijalizacija File na 0
		JFileChooser chooser = new JFileChooser(); // Izbornik filova objekat
		
		if ( chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION )
		{
	         selectedFile = chooser.getSelectedFile(); //file objekat dobiva vrijednost od chooser objekta
	         fileScanner = new Scanner(selectedFile); // saljemo Scaneru file na analizu
	    }
		
		while (fileScanner.hasNextLine()) // dok u fajlu ima linija ponavljaj loop
		{
			  linesCount++;     
		      String line = fileScanner.nextLine(); // red se stavlja u String line
		      Scanner lineScanner = new Scanner(line); // red se salje na analizu
		       while(lineScanner.hasNext()) // sve dok ima rijeci ponavljaj
		      {
		        wordsCount++;
		        String word = lineScanner.next();  
		        charsCount += word.length(); //uzmi duzinu rijeci i dodaj na brojac karaktera

		      } 
		      lineScanner.close();
		 }

		
        System.out.println("# of chars: " + charsCount);
        System.out.println("# of words: " + wordsCount);
        System.out.println("# of lines: " + linesCount);

        fileScanner.close();
		//EndCopyCode I Ahmed understand this code
				

	}

}
