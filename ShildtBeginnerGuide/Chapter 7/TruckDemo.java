/*
	Упражнение 7.1

	Создание подкласса Vehicle для грузовиков
*/
class Vehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;

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

	// Методы доступа к переменнным экземпляра
	int getPassengers(){ return passengers; }
	void setPassengers(int p) { passengers = p; }
	int getFuelcap(){ return fuelcap; }
	void setFuelcap(int f) { fuelcap = f; }
	int getMpg(){ return mpg; }
	void setMpg(int m) { mpg = m; }
}

// Расширение класса Vehicle для грузовиков
class Truck extends Vehicle {
	private int cargoCap; // грузоподъемность в фунтах

	// Конструктор класса Truck
	Truck(int p, int f, int m, int c) {
		/*
			Инициализация членов класса Vehicle
			с использованием конструктора этого класса.
		*/
		super(p, f, m);
		cargoCap = c;
	}

	// Методы доступа к переменной cargoCap
	int getCargo() {return cargoCap;}
	void setCargo(int c) {cargoCap = c;}
}

class TruckDemo {
	public static void main(String args[]) {
		// Создать ряд новых объектов типа Truck
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;

		gallons = semi.fuelNeeded(dist);

		System.out.println("Грузовик может перевезти " + semi.getCargo() + 
							" фунтов.");
		System.out.println("Для преодоления " +  dist + " миль грузовику " +
							"требуется " + gallons + " галлонов топлива.\n");

		gallons = pickup.fuelNeeded(dist);

		System.out.println("Пикап может перевезти " + pickup.getCargo() + 
							" фунтов.");
		System.out.println("Для преодоления " + dist + " миль грузовику " +
							"требуется " + gallons + " галлонов топлива.\n");
	}
}