/*
	Упражнение 5.3

	Класс, реализующий очередь для хранения чисел
*/
class Queue {
	int q[]; // массив для хранения элементов очереди
	int putloc, getloc; // индексы для вставки и извлечения
						// элементов очереди

	Queue (int size) {
		q = new int[size + 1]; // выделить память для очереди
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	void put(int nt) {
		if(putloc == q.length - 1) {
			System.out.println(" - Очередь заполнена");
			return;
		}

		putloc++;
		q[putloc] = nt;
	}

	// Извлечь символ из очереди
	int get() {
		if (getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return 0;
		}

		getloc++;
		return q[getloc];
	}
}

class IntQDemo {
	public static void main(String args[]) {
		Queue smallQ = new Queue (4);
		Queue bigQ = new Queue (100);
		int nt;
		int i;

		System.out.println("Использование очереди bigQ для " +
							"сохранения алфавита");
		// Поместить буквенные символы в очередь bigQ
		for(i = 0; i < 26; i++)
			bigQ.put(i);

		// Извлечь символы из очереди bigQ и отобразить
		System.out.print("Содержимое очереди: ");
		for(i = 0; i < 26; i++) {
			nt = bigQ.get();
			if(nt != 0) System.out.print(nt + " ");
		}

		System.out.println("\n");

		System.out.println("Использование очереди smallQ " +
							"для генерации ошибок");
		// Использовать очередь smallQ для генерации ошибок
		for(i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " +
							i);
			smallQ.put(i);

			System.out.println();
		}
		System.out.println();

		// Дополнительные ошибки при обращении к очереди smallQ
		System.out.print("Содержимое smallQ: ");
		for(i = 0; i < 5; i++) {
			nt = smallQ.get();
			if(nt != 0) System.out.print(nt + " ");
		}
	}
}