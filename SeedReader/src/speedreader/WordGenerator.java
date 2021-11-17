package speedreader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author walsl
 *
 */
public class WordGenerator {
	Scanner text ;
	int wordCount;
	int sentanceCount;
	
	/**
	 * @param file
	 * @throws FileNotFoundException
	 */
	public WordGenerator(String file) throws FileNotFoundException {
		text = new Scanner(new FileReader(file));
		wordCount =0;
		sentanceCount =0;
	}
	
	/**
	 * @return boolean that indicates if text has another word to grab
	 */
	public boolean hasNext() {
		return text.hasNext();
		
	}
	/**
	 * @return next word in next
	 */
	public String getNext() {
		wordCount++;
		return text.next();
	}
	
	/**
	 * @return number of words returned by word generator so far
	 */
	public int getWordCount() {
		return wordCount;
	}
	/**
	 * @param word
	 * @return number of sentances present in text based on puncuation counting method
	 */
	public Integer getSentancesCount(String word) {
		int lastIndexofWord = word.length() -1;
		if(word.charAt(lastIndexofWord) == '.') {
			sentanceCount ++;
			return sentanceCount;

		}
		else if(word.charAt(lastIndexofWord) == '?') {
			sentanceCount ++;
			return sentanceCount;

		}
		else if(word.charAt(lastIndexofWord) == '!') {
			sentanceCount ++;
			return sentanceCount;

		}
		else {
			return sentanceCount;
		}

	}

}
