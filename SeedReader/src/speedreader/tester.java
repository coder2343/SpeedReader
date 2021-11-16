package speedreader;

import java.io.FileNotFoundException;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WordGenerator tester = new WordGenerator("PolishNewsArticle.txt");
			while(tester.hasNext() == true) {
				String newStrng = tester.getNext();
				System.out.println(newStrng);
				System.out.println("sentance count "  + tester.getSentancesCount(newStrng));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
