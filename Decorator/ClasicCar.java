public class ClasicCar extends CarDecorator {

	public ClasicCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Clasic Car.");
	}
}