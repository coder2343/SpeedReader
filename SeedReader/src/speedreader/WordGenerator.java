package speedreader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordGenerator {
	Scanner text ;
	int wordCount;
	int sentanceCount;
	public WordGenerator(String file) throws FileNotFoundException {
		text = new Scanner(new FileReader(file));
		wordCount =0;
		sentanceCount =0;
	}
	
	public boolean hasNext() {
		return text.hasNext();
		
	}
	public String getNext() {
		wordCount++;
		return text.next();
	}
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
