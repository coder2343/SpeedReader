package speedreader;

import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;


/**
 * @author walsl
 *
 * class that runs and executes Speed Reader class with comand line propmts supplied by  user.
 * 
 * 
 * Name(s) of all authors
Assignment name Exra credit speed reader
Assignment due date 11/29/21
Written/online sources used: (enter "none" if no sources other than the textbook and course website used)
none

Help obtained: (enter "none" if no help was given outside of the class period. But if you consult an evening tutor, another student, or the course mentor during mentor sessions, add their names here)
none
Add the statement: "I confirm that the above list of sources is complete AND 
that  Ihave not talked to anyone else (e.g., CSC 207 students) about the solution to this problem."
 */
public class SpeedReader {


	/**
	 * @param args. Arugments supplied by comand line  
	 * Usage: SpeedReader <filename> <width> <height> <font size> <wpm>

	 */
	public static void main(String[] args) {
		
		// drawing pannel
		
		//TODO Add file name to code and peramitor
		String fileName = null;
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
			System.out.println("exiting param had error");
			width = 0;
			hight = 0;
			fontSize = 0;
			wpm = 0;
			fileName= "a";

		}

		DrawingPanel panel = new DrawingPanel(width, hight);
		Graphics g = panel.getGraphics();
		Font f = new Font("Courier", Font.BOLD, fontSize);
		panel.setVisible(true); 
		g.setFont(f);


		try {
			WordGenerator tester = new WordGenerator(fileName);
			int wordsPerSecond = (wpm/60);
			double wordsReadPerSecond = (1/(double)wordsPerSecond);
			int threadSleepTime = (int)(wordsReadPerSecond *1000);
			System.out.println( threadSleepTime );
			while(tester.hasNext()) { 
				g.setFont(f); g.drawString(tester.getNext(),100, 70); // g.setFont(l);
				Thread.sleep(threadSleepTime);
				panel.clear(); 
			}

		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	/*
	 * this method does not really work. Just storing this in code for future idea
	 * work on this later 
	 * public void printStaggered(WordGenerator text, int secondSleep, DrawingPanel
	 * p, Graphics g) throws InterruptedException { int secondsSpace = secondSleep
	 * *1000; while(text.hasNext()) { g.drawString( text.getNext(), 100, 100);
	 * p.clear(); Thread.sleep(secondsSpace);
	 * 
	 * } // while } // printStaggered
	 */	
}
