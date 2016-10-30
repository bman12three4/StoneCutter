package com.byronlathi.window;

import java.awt.Graphics;

import javax.swing.JFrame;

import com.byronlathi.Constants;
import com.byronlathi.Options;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static JFrame frame;
	public static boolean isClosed = false;
	public static boolean clear = false;

	// Getters and Setters
	/**
	 * The JFrame
	 * 
	 * @return The frame
	 */
	public static JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize and create the frame.
	 */
	public static void init() {
		frame = new JFrame(Constants.WINDOW_NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if (Constants.frameType == Constants.frameTypes.FIXED) {
			frame.setSize(Options.getWINDOW_DIMESIONS());
		} else {
			frame.pack();
		}
		if (Constants.resizeType == Constants.frameTypes.FIXED){
			frame.setResizable(false);
		} else {
			frame.setResizable(true);
		}
		frame.setVisible(true);
	}
	
	public static void run() {
		if (Menu.getCurrentMenu() != null){
			frame.add(Menu.getCurrentMenu());
			Window.frame.getContentPane().invalidate();
			Window.frame.getContentPane().validate();
		}
	}
	
	@Override
	public void paint(Graphics g){
		if (clear){
			g.drawRect(0, 0, Options.getWINDOW_DIMESIONS().width, Options.getWINDOW_DIMESIONS().height);
			clear = false;
		}
	}
	
	public static void quit(){
		isClosed = true;
		frame.dispose();
	}
}
