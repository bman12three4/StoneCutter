package com.byronlathi.window;

import javax.swing.JPanel;

import com.byronlathi.window.menu.MainMenu;
import com.byronlathi.window.menu.NewGame;

public class Menu {
	protected static JPanel currentMenu;

	public static JPanel getCurrentMenu() {
		return currentMenu;
	}

	public static void setCurrentMenu(JPanel p) {
		if (currentMenu != null) {
			Window.frame.remove(getCurrentMenu());
		}
		currentMenu = p;
	}

	public static void clear() {
		Window.getFrame().getContentPane().remove(getCurrentMenu());
		Window.clear = true;
		currentMenu = noMenu();
	}

	public static JPanel mainMenu() {
		MainMenu menu = new MainMenu();
		return menu.menu();

	}

	public static JPanel newGame() {
		NewGame menu = new NewGame();
		return menu.menu();
	}

	public static JPanel noMenu() {
		return null;
	}

}
