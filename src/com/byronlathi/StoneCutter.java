package com.byronlathi;

import com.byronlathi.window.Menu;
import com.byronlathi.window.Window;

public class StoneCutter {

	public static void main(String[] args) {
		Window.init();
		Menu.setCurrentMenu(Menu.mainMenu());
		while (!Window.isClosed){
			Window.run();
		}
	}

}
