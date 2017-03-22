// Добавление метода range() в класс Vehicle

class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap; // емкость топливного бака
	int mpg; // потребление топлива в милях на галлон

	// Отобразить дальность поездки транспортного средства
	void range() {
		System.out.println("Дальность - " + fuelcap * mpg + " миль");
	}
}

class AddMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		Vehicle sedan = new Vehicle();

		int range1, range2, range3;

		// Присвоить значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присвоить значения полям в объекте sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		// Присвоить значения полям в объекте sedan
		sedan.passengers = 4;
		sedan.fuelcap = 16;
		sedan.mpg = 10;

		
		System.out.print("Седан может перевезти " +
						 sedan.passengers + " пассажиров. ");

		sedan.range(); // отобразить дальность поездки мини-фургона


		System.out.print("Мини-фургон может перевезти " +
							minivan.passengers + " пассажиров. ");

		minivan.range(); // отобразить дальность поездки мини-фургона


		System.out.print("Спортивный автомобиль может перевезти " +
							sportscar.passengers + " пассажиров. ");

		sportscar.range(); // отобразить дальность поездки
						   // спортивного автомобиля
	}
}