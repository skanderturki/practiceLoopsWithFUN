package practiceLoopsWithFUN;

import javax.swing.JFrame;

/**
 * DO NOT MODIFY THIS FILE !!
 * The code in this file is only there to initialize the graphical 
 * components we need.
 * 
 * @author Skander Turki
 * @email sturki@psu.edu.sa
 *
 */
public class MainTest {

	private static final String TITLE = "Practice Loops with FUN";
	
	// Do not worry about this code, DO NOT CHANGE IT !!
	public static void main(String[] args) {
		
		// create a frame (a window that can have a menu)
		JFrame frame = new JFrame(TITLE);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// create a drawing area (JPanel), see the other file for details
		ColorJPanel colorJPanel = new ColorJPanel(); // create ColorJPanel
		frame.add( colorJPanel ); // add colorJPanel to frame
		
		// Set the window size and display it
		frame.setSize( 640, 480 ); // set frame size
		frame.setVisible( true ); // display frame
	}

}
