package com.byronlathi.window.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.byronlathi.window.Menu;
import com.byronlathi.window.Window;

public class MainMenu implements ActionListener{
	public JPanel menu(){
		JPanel mainMenu = new JPanel();
		JButton quit = new JButton("Quit to Desktop");
		JButton startGame = new JButton("Start Game");
		quit.addActionListener(this);
		startGame.addActionListener(this);
		mainMenu.add(quit);
		mainMenu.add(startGame);
		return mainMenu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Quit to Desktop")){
			System.out.println("Quiting...");
			Window.quit();
		}
		if (e.getActionCommand().equals("Start Game")){
			System.out.println("Starting Game...");
			Menu.setCurrentMenu(Menu.newGame());
		}
		
	}

}
