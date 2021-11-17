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

	
	//todo add comand line args
	public static void main(String[] args) throws FileNotFoundException {
		//SpeedReader testeReader = new SpeedReader();
		// drawing pannel
		String fileName;
		int width;
		int hight;
		int wpm;
		int fontSize;
		try {
			fileName = args[0];
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		try {
			width = Integer.parseInt(args[1]);
			hight = Integer.parseInt(args[2]);
			fontSize = Integer.parseInt(args[3]);
			wpm = Integer.parseInt(args[4]);


		}
		catch( NumberFormatException e) {
			e.printStackTrace();
			System.out.println("exiting proam had error");
			width = 0;
			hight = 0;
			fontSize = 0;
			wpm = 0;
			
		}
	
				 DrawingPanel panel = new DrawingPanel(width, hight);
				  Graphics g = panel.getGraphics();
				  Font f = new Font("Courier", Font.BOLD, fontSize);
				//Font l = new Font("Courier", Font.BOLD, 0);
				  panel.setVisible(true); 

				 // panel.setBackground(new Color(16));
				  g.setFont(f);
				 
				  
				try {
					//SpeedReader testReader = new SpeedReader();
					WordGenerator tester = new WordGenerator("PolishNewsArticle.txt");
					int wordsPerSecond = wpm/60;
				
					  while(tester.hasNext()) { 
						  g.setFont(f); g.drawString(tester.getNext(),100, 70); // g.setFont(l);
						  Thread.sleep(1000); panel.clear(); 
						  }
					  
					  
					 
					
					
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
