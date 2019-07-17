
public class IntToHexExp implements Expression {

	private int i;
	
	public IntToHexExp(int c){
		this.i=c;
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexadecimalFormat(i);
	}

}
