public class InterpreterCl {

	public InterpreterContext ic;
	
	public InterpreterCl(InterpreterContext i){
		this.ic=i;
	}
	
	public String interpret(String str){
		Expression exp = null;
		//create rules for expressions
		if(str.contains("Hexadecimal")){
			exp=new IntToHexExp(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else if(str.contains("Binario")){
			exp=new IntToBinaryExp(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else return str;
		
		return exp.interpret(ic);
	}
	
	public static void main(String args[]){
		String str1 = "28 en Binario";
		String str2 = "28 en Hexadecimal";
		String str3 = "18 en Binario";
		String str4 = "18 en Hexadecimal";
		InterpreterCl ec = new InterpreterCl(new InterpreterContext());
		System.out.println(str1+" = "+ec.interpret(str1));
		System.out.println(str2+" = "+ec.interpret(str2));
		System.out.println(str3+" = "+ec.interpret(str3));
		System.out.println(str4+" = "+ec.interpret(str4));

	}
}
