package com.inheritance.child;

import com.inheritance.patent.MicroProcessor_8051;

public class MicroController_430 extends MicroProcessor_8051{

	int ROM=0, RAM=0;
	
	public MicroController_430(String name, int ROM, int RAM){
		super(name);
		this.ROM = ROM;
		this.RAM = RAM;
	}
	
	public void show_controller() {
		System.out.println("The ROM and RAM are " + ROM + ","+  RAM + " KiloBytes");
	}
}
