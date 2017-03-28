// Добавление конструктора
class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	// это конструктор класса Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Определить дальность поездки транспортного средства
	int range() {
		return mpg * fuelcap;
	}

	// Рассчитать объем топлива, необходимого транспортному
	// средству для преодоления заданного расстояния
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}
}

class VehConsDemo {
	public static void main(String args[]) {
		
		// Полностью сконструированть объекты транспортных средств
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);

		double gallons;
		int dist = 252;

		gallons = minivan.fuelNeeded(dist);

		System.out.println("Для преодоления " + dist +
			" миль мини-фургону требуется " + 
			gallons + " галлонов топлива");

		gallons = sportscar.fuelNeeded(dist);

		System.out.println("Для преодоления " + dist +
			" миль спортивному автомобилю требуется " + 
			gallons + " галлонов топлива");

	}
}