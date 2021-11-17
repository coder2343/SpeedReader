package speedreader;

import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;


public class SpeedReader {
	public void printStaggered(WordGenerator text, int secondSleep, DrawingPanel p, Graphics g) throws InterruptedException {
		int secondsSpace = secondSleep *1000;
		   while(text.hasNext()) {
			   g.drawString( text.getNext(), 100, 100);
		     p.clear();
		     Thread.sleep(secondsSpace);

		   } // while
		 } // printStaggered
	
	
	// set up coamnd line arguments;Usage: SpeedReader <filename> <width> <height> <font size> <wpm>

	public static void main(String[] args) throws FileNotFoundException {
		//SpeedReader testeReader = new SpeedReader();
		// drawing pannel
				 DrawingPanel panel = new DrawingPanel(400, 300);
				  Graphics g = panel.getGraphics();
				  Font f = new Font("Courier", Font.BOLD, 20);
				//Font l = new Font("Courier", Font.BOLD, 0);
				  panel.setVisible(true); 

				 // panel.setBackground(new Color(16));
				  g.setFont(f);
				 
				  
				try {
					//SpeedReader testReader = new SpeedReader();
					WordGenerator tester = new WordGenerator("PolishNewsArticle.txt");
					while(tester.hasNext()) {
					   } // while
					//testReader.printStaggered(tester, 2,panel,g );
					
					  while(tester.hasNext()) { 
						  g.setFont(f); g.drawString(tester.getNext(),
					  100, 70); // g.setFont(l);
					  
					  Thread.sleep(1000); panel.clear(); }
					  
					  
					 
					
					
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
