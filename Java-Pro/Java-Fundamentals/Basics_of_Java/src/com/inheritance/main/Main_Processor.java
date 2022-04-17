package com.inheritance.main;

import java.util.Scanner;

import com.inheritance.child.Processor_PI;

public class Main_Processor {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Name of Processor is : ");
		String pro_name = scan.next();
		
		System.out.println("ROM of Processor is : ");
		int pro_ROM = scan.nextInt();
		
		System.out.println("RAM of Processor is : ");
		int pro_RAM = scan.nextInt();
		
		System.out.println("No of Processor pins are : ");
		int pro_pins = scan.nextInt();
		
		scan.close();
		Processor_PI MC = new Processor_PI(pro_name,pro_ROM,pro_RAM,pro_pins);
		
		MC.show_name();
		MC.show_controller();
		MC.show_processor();
	}

}
