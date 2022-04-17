package com.inheritance.child;

public class Processor_PI extends MicroController_430 {

	int no_of_pins = 0;
	public Processor_PI(String name, int ROM, int RAM, int no_of_pins) {
		super(name, ROM, RAM);
		this.no_of_pins = no_of_pins;
		
	}
	
	public void show_processor() {
		System.out.println("The Processor has no of pins = " + no_of_pins);
	}

	
}
