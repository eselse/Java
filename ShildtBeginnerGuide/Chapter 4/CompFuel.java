/*
	Добавление параметризованного метода, в котором производится
	расчет объема топлива, необходимого транспортному средству для
	преодоления заданного расстояния.
*/
class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	// Определить дальность поездки транспортного средства
	int range() {
		return mpg * fuelcap;
	}

	// Рассчитать объем топлива, необходимого транспортному
	// средству для преодоления заданного расстояния
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class CompFuel {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		double gallon;
		int dist = 252;

		// Присвоить значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присвоить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		gallons = minivan.fuelneeded(dist);

		System.out.println("Для преодоления " + dist +
			" миль мини-фургону требуется " + 
			gallons + " галлонов топлива");

		gallons = sportscar.fuelneeded(dist);

		System.out.println("Для преодоления " + dist +
			" миль спортивному автомобилю требуется " + 
			gallons + " галлонов топлива");
	}
}