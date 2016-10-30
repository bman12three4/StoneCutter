package com.byronlathi;

import java.awt.Dimension;

public class Options {
	private static Dimension WINDOW_DIMESIONS = new Dimension(800, 600);

	public static Dimension getWINDOW_DIMESIONS() {
		return WINDOW_DIMESIONS;
	}

	public void setWINDOW_DIMESIONS(Dimension WINDOW_DIMESIONS) {
		Options.WINDOW_DIMESIONS = WINDOW_DIMESIONS;
	}
}
