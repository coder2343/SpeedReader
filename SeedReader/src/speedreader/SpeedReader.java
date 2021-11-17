package speedreader;

import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;

import javax.swing.text.StyleConstants.FontConstants;

public class SpeedReader {
	public void printStaggered(WordGenerator text) throws InterruptedException {
		   while(text.hasNext()) {
		     System.out.println(text.getNext());
		     Thread.sleep(1000);
		   } // while
		 } // printStaggered
	public static void main(String[] args) throws FileNotFoundException {
		// drawing pannel
				 DrawingPanel panel = new DrawingPanel(400, 300);
				  Graphics g = panel.getGraphics();
				  Font f = new Font("Courier", Font.BOLD, 20);
				  panel.setVisible(true); 

				 // panel.setBackground(new Color(16));
				  g.setFont(f);

				  
				try {
					SpeedReader testReader = new SpeedReader();
					WordGenerator tester = new WordGenerator("PolishNewsArticle.txt");
					while(tester.hasNext()) {
						//  g.setFont(f);
						g.drawString(tester.getNext(), 100, 70);	
						 // g.setFont(l);

					     Thread.sleep(1000);
							panel.clear();


					   } // while
					
					
					
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
