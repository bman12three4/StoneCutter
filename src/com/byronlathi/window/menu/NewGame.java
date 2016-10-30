package com.byronlathi.window.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NewGame implements ActionListener{
	public JPanel menu(){
		JPanel mainMenu = new JPanel();
		JButton play = new JButton("Play");
		play.addActionListener(this);
		mainMenu.add(play);
		return mainMenu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Play")){
			System.out.println("Playing...");
		}
	}
}
