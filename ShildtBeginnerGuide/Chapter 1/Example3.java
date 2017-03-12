/*
	Демонстрация различий между типами int и double.
	Присвойте файлу с исходным кодом имя Example3.java
*/
class Example3 {
	public static void main(String args[]) {
		int var; // объявить уелочисленную переменную
		double x; // объявить переменную с плавающей точкой

		var = 10; // присвоить переменной var значение 10

		x = 10.0; // присвоить переменной x значение 10.0

		System.out.println("Начальное значение перменной var: " + var);
		System.out.println("Начальное значение перменной x: " + x);
		System.out.println();

		// Разделить значения обеих перменных на 4
		var = var / 4;
		x = x / 4;

		System.out.println("Значение переменной var после деления: " + var);
		System.out.println("Значение переменной x после деления: " + x);
	}
}