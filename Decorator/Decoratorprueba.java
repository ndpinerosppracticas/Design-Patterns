public class Decoratorprueba {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		System.out.println("\n*****");
		
		Car clasicLuxuryCar = new ClasicCar(new LuxuryCar(new BasicCar()));
		clasicLuxuryCar.assemble();
	}

}