package template.printer;

public abstract class Abstract3dPrinter {

	protected String statement;
	
	public Abstract3dPrinter(){
		statement = "";
	}
	
	public final String createObject() {
		
		start();
		model();
		print();
		finish();
		
		return statement;
		
	}

	protected void model() {
		String item = "Generic modelling process.... same for all 3d printers";
		System.out.println(item);
		statement += item;
	}

	protected abstract void start();
	protected abstract void finish();
	protected abstract void print();

}
