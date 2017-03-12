/*
	Упражнение 1.2

	Эта программа отображает таблицу перевода галлонов в литры.

	Присвойте файлу с исходным кодом имя GalToLiTable.java.
*/
class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;
		int counter;

		counter = 0;
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // преобразовать в литры
			System.out.println(gallons + " галлонам соответствует " +
								liters + " liters.");
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0; // сбросить счетчик строк
			}
		}
	}
}