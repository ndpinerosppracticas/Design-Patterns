
public class IntToBinaryExp implements Expression {

	private int i;
	
	public IntToBinaryExp(int c){
		this.i=c;
	}
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryFormat(this.i);
	}

}
