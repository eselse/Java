/*
	Упражнение 5.4

	Класс, реализующий очередь для хранения чисел с плавающей точкой
*/
class Queue {
	double q[]; // массив для хранения элементов очереди
	int putloc, getloc; // индексы для вставки и извлечения
						// элементов очереди

	Queue (int size) {
		q = new double[size + 1]; // выделить память для очереди
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	void put(double dbl) {
		if(putloc == q.length - 1) {
			System.out.println(" - Очередь заполнена");
			return;
		}

		putloc++;
		q[putloc] = dbl;
	}

	// Извлечь символ из очереди
	double get() {
		if (getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return (double) 0;
		}

		getloc++;
		return q[getloc];
	}
}

class DoubleQDemo {
	public static void main(String args[]) {
		Queue smallQ = new Queue (4);
		Queue bigQ = new Queue (100);
		double dbl;
		int i;

		System.out.println("Использование очереди bigQ для " +
							"сохранения алфавита");
		// Поместить буквенные символы в очередь bigQ
		for(i = 0; i < 26; i++)
			bigQ.put((double) i);

		// Извлечь символы из очереди bigQ и отобразить
		System.out.print("Содержимое очереди: ");
		for(i = 0; i < 26; i++) {
			dbl = bigQ.get();
			if(dbl != (double) 0) System.out.print(dbl + " ");
		}

		System.out.println("\n");

		System.out.println("Использование очереди smallQ " +
							"для генерации ошибок");
		// Использовать очередь smallQ для генерации ошибок
		for(i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " +
							(double) i);
			smallQ.put((double) i);

			System.out.println();
		}
		System.out.println();

		// Дополнительные ошибки при обращении к очереди smallQ
		System.out.print("Содержимое smallQ: ");
		for(i = 0; i < 5; i++) {
			dbl = smallQ.get();
			if(dbl != (double) 0) System.out.print(dbl + " ");
		}
	}
}