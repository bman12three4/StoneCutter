package com.byronlathi.game;

import lib.util.Date;

public class Job {
	
	String name;
	CadFile file;
	Material material;
	Color color;
	Slab slab;
	Date date;
	
	/**
	 * 
	 * @param name The name of the customer
	 * @param file The CAD File 
	 * @param material The type of material, quartz, granite, etc.
	 * @param color The color fo the material
	 * @param slab Which slab should be cut
	 * @param date The due date of the job.
	 */
	public Job(String name, CadFile file, Material material, Color color, Slab slab, Date date){
		this.name = name;
		this.file = file;
		this.material = material;
		this.color = color;
		this.slab = slab;
		this.date = date;
	}
	/**
	 * 
	 * @param name The name of the customer
	 * @param file The CAD File 
	 * @param material The type of material, quartz, granite, etc.
	 * @param color The color fo the material
	 * @param date The due date of the job.
	 */
	public Job(String name, CadFile file, Material material, Color color, Date date){
		this.name = name;
		this.file = file;
		this.material = material;
		this.color = color;
		this.slab = null;
		this.date = date;
	}
	
	public String getName(){
		return name;
	}
	
}
