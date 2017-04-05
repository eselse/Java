// Усовершенствованный класс очереди, предназначенный
// для хранения символьных значений
class Queue {
	// Эти члены класса теперь являются закрытыми
	private char q[]; // массив для хранения элементов очереди
	private int putloc, getloc; // индексы для вставки и
								// извлечения элементов очереди

	Queue(int size) {
		q = new char[size + 1];	// выделить память для очереди
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	void put(char ch) {
		if(putloc == q.length - 1) {
			System.out.println(" - Очередь заполнена");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}

	// Извлечь символ из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

class QDemoImp {
	public static void main(String args[]) {
		Queue q = new Queue(26);
		int i;
		char ch;

		// Внести данные в очередь
		for(i = 0; i < 26; i++)
			q.put((char) ('A' + i));

		System.out.println("Извлечь данные из очереди.");
		// Извлечь данные из очереди
		for(i = 0; i < 26; i++) {
			ch = q.get();
			System.out.print(ch + " ");
		}

		System.out.println();
	}
}