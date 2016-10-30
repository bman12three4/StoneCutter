package com.byronlathi.game;

import lib.util.Date;

public class Job {
	
	String name;
	CadFile file;
	Material material;
	Color color;
	Slab slab;
	Date date;
	
	public Job(String name, CadFile file, Material material, Color color, Slab slab, Date date){
		this.name = name;
		this.file = file;
		this.material = material;
		this.color = color;
		this.slab = slab;
		this.date = date;
	}
	public Job(String name, CadFile file, Material material, Color color, Date date){
		this.name = name;
		this.file = file;
		this.material = material;
		this.color = color;
		this.slab = null;
		this.date = date;
	}
	
}
