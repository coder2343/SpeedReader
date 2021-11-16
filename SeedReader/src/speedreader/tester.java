package speedreader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DrawingPanel panel = new DrawingPanel(400, 300);
		  Graphics g = panel.getGraphics();
		  Font f = new Font("Courier", Font.BOLD, 20);
		 // panel.setBackground(new Color(16));
		  g.setFont(f);
		  g.drawString("Hello World!", 100, 70);	
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
