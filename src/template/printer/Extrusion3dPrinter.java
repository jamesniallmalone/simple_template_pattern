package template.printer;

public class Extrusion3dPrinter extends Abstract3dPrinter {

	@Override
	protected void start() {
		String startmessage = "Starting up the extrusion machine..."; 
		System.out.println(startmessage);
		statement += startmessage;
	}

	@Override
	protected void finish() {
		String finishmessage = "Finishing off the plastic object"; 
		System.out.println(finishmessage);
		statement += finishmessage;
	}

	@Override
	protected void print() {
		String printmessage = "Load up the plastics for extrusion \nStart the extrusion printing process \nStart making plastic object"; 
		System.out.println(printmessage);
		statement += printmessage;
	}

}
