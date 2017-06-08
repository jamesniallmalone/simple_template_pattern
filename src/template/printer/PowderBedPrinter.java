package template.printer;

public class PowderBedPrinter extends Abstract3dPrinter {
	@Override
	protected void start() {
		String startmessage = "Starting up the powderbed machine..."; 
		System.out.println(startmessage);
		statement += startmessage;
	}

	@Override
	protected void finish() {
		String finishmessage = "Finishing off the plaster object"; 
		System.out.println(finishmessage);
		statement += finishmessage;
	}

	@Override
	protected void print() {
		String printmessage = "Load up the plaster for powderbed printing \nStart the moulding process \nStart making plaster object"; 
		System.out.println(printmessage);
		statement += printmessage;
	}

}
