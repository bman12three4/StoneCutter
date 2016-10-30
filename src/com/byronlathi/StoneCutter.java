package com.byronlathi;

import java.io.File;

import com.byronlathi.game.Job;
import com.byronlathi.window.Menu;
import com.byronlathi.window.Window;

import lib.util.JobReader;

public class StoneCutter {

	public static void main(String[] args) {
		Window.init();
		Menu.setCurrentMenu(Menu.mainMenu());
		Job j = null;
		File f = new File("/StoneCutter/src/data/jobs.json");
		System.out.println(f.exists());
		while (!Window.isClosed){
			Window.run();
		}
	}

}
