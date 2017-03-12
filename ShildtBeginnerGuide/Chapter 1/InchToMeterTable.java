/*
 	Эта программа отображает таблицу пребразования дюймов в метры.

 	Присвойте этому файлу имя InchToMeterTable.java
 */
 class InchToMeterTable {
 	public static void main(String args[]) {
 		double inches, meters;
 		int counter;

 		counter = 0;
 		for(inches = 1; inches <= 144; inches++) {
 			meters = inches / 39.37; // преобразовать в метры
 			System.out.println(inches + " дюймов равно " +
 								meters + " метров");

 			counter++;
 			// Каждая 12-я  выводимая строка должна быть пустой
 			if(counter == 12) {
 				System.out.println();
 				counter = 0; // сбросить счетчик строк
 			}
 		}
 	}
 }