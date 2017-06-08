package template;

import template.printer.Abstract3dPrinter;
import template.printer.Extrusion3dPrinter;
import template.printer.PowderBedPrinter;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Try out the new 3d extrusion printer");
		Abstract3dPrinter extrusionPrinter = new Extrusion3dPrinter();
		extrusionPrinter.createObject();
		
		System.out.println("Try out the 3d powderbed printer");
		Abstract3dPrinter powderBedPrinter = new PowderBedPrinter();
		powderBedPrinter.createObject();
	}

}
