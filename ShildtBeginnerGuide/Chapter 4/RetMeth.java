// Использование возвращаемого значения
class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap; // емкость топливного бака
	int mpg; // потребление топлива в милях на галлон

	// Возврат дальности поездки.
	int range() {
		return mpg * fuelcap;
	}
}

class RetMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		// Присвоить значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 12;

		// Присвоить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		// Получить дальности поездки для разных транспортных средств
		range1 = minivan.range();
		range2 = sportscar.range();

		System.out.println("Мини-фургон может перевезти " +
			minivan.passengers + " пассажиров на расстояние " + range1 + " миль");

		System.out.println("Cпорткар может перевезти " +
			sportscar.passengers + " пассажиров на расстояние " + range2 + " миль");
	}
}