package template.printer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class Extrusion3dPrinterTestObject extends Extrusion3dPrinter{
	public String getStatement(){
		return statement;
	}
}

public class Extrusion3dPrinterTest {
	
	private Extrusion3dPrinterTestObject testprinter;

	@Before
	public void initialise(){
		testprinter = new Extrusion3dPrinterTestObject();
	}

	@Test
	public void testStart() {
		testprinter.start();
		
		assertEquals("Statement...", "Starting up the extrusion machine..." , testprinter.getStatement());
	}

	@Test
	public void testFinish() {
		testprinter.finish();;
		
		assertEquals("Statement...", "Finishing off the plastic object" , testprinter.getStatement());
	}

	@Test
	public void testPrint() {
		testprinter.print();
		
		String statement = "Load up the plastics for extrusion \nStart the extrusion printing process \nStart making plastic object";
		
		assertEquals("Statement...", statement, testprinter.getStatement());
	}

}
