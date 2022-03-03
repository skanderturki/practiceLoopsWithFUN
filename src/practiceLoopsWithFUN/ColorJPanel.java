package practiceLoopsWithFUN;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * This is a drawing area that will be displayed by the main program.
 * The method paintComponent will be automatically called when the window (JFrame)
 * is displayed, so you do not need to call it yourself.
 * 
 * 
 * @author Skander Turki
 * @email sturki@psu.edu.sa
 *
 */
public class ColorJPanel extends JPanel{
	
	
	/** YOU DO NOT NEED TO CHANGE THIS METHOD !!
	 * This method will draw the hole area.
	 */
	public void paintComponent( Graphics g){
		
		// Do not worry about this code, do not change it
		super.paintComponent( g ); // call superclass's paintComponent
		this.setBackground( Color.BLACK );

		// Initialize the matrix we want to draw
		byte[][] cells = new byte[10][10];
		
		// HERE choose how you will fill the matrix "cells"
		// The pattern will be displayed by the "drawCells" method.
		fillArrayWithChessLikePattern(cells);
		
		// If you want to try a random matrix, use this method (randomlyFillArray).
		//randomlyFillArray(cells);
		
		// If you want to check the matrix state
		// uncomment this line of code
		// System.out.println(Arrays.deepToString(cells));
		
		// draw the given cells matrix
		drawCells(g, cells, 5, new Color( 255, 255, 255 ));

	}
	
	
	/**
	 * YOU DO NOT NEED TO CHANGE THIS METHOD !!
	 * Draws the given "cells" matrix into the given graphics area "g".
	 * It draws rectangles of size "rectSize" for each cell that is not zero.
	 * It uses the given color to draw the rectangles.
	 */
	private void drawCells(Graphics g, byte[][] cells, int rectSize, Color color) {
		if(cells.length == 0) return;
		g.setColor( color ); 
		int x = 0, y = 0;
		int squareWidth = this.getWidth() / cells.length;
		int squareHeight = this.getHeight() / cells[0].length;
		
		for(int i = 0; i < cells.length; i++) {
			x = 0;
			for( int j = 0; j < cells[i].length; j++) {
				//check if the cell needs to be drawn
				if( cells[i][j] > 0 ) g.fillRect( x, y, squareWidth, squareHeight);
				
				//compute next x
				x = x + squareWidth;
			}
			//compute next y
			y = y + squareHeight;
		}
		
	}

	/**
	 * YOU DO NOT NEED TO CHANGE THIS METHOD !!
	 * This method fills the given matrix "cells" randomly with ones and zeros.
	 */
	private void randomlyFillArray(byte[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = (byte)((Math.random() + 0.5)/1);
		}
	}
	
	/**
	 * This method fills the "cells" matrix with a chess board pattern.
	 */
	private void fillArrayWithChessLikePattern(byte[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				if( (i + j) % 2 ==0 ) arr[i][j] = 1;
		}
	}
	
}