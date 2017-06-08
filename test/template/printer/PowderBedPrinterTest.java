package template.printer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class PowderBedPrinterTestObject extends PowderBedPrinter{
	public String getStatement(){
		return statement;
	}
}

public class PowderBedPrinterTest {
	
	private PowderBedPrinterTestObject testprinter;

	@Before
	public void initialise(){
		testprinter = new PowderBedPrinterTestObject();
	}

	@Test
	public void testStart() {
		testprinter.start();
		
		assertEquals("Statement...", "Starting up the powderbed machine..." , testprinter.getStatement());
	}

	@Test
	public void testFinish() {
		testprinter.finish();
		
		assertEquals("Statement...", "Finishing off the plaster object" , testprinter.getStatement());
	}

	@Test
	public void testPrint() {
		testprinter.print();
		
		String statement = "Load up the plaster for powderbed printing \nStart the moulding process \nStart making plaster object";

		
		assertEquals("Statement...", statement, testprinter.getStatement());
	}
}
