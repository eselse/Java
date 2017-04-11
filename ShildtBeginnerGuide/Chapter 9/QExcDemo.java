/*
	Упражнение 9.1
	Добавление обработчиков исключений в лкасс очереди
*/
// Исключение, указывающее на переполнение очереди
class QueueFullException extends Exception {
	int size;

	QueueFullException (int s) { size = s; }

	public String toString() {
		return "\nОчередь заполнена. Максимальный размер очереди: " + 
			size;
	}
}

// Исключение, указывающее на исчерпание очереди
class QueueEmptyException extends Exception {

	public String toString() {
		return "\nОчередь пуста.";
	}
}

// Класс, реализующий очередь фиксированного размера
// для зранения символов
class FixedQueue implements ICharQ {
	private  char q[]; // Массив для хранения элементов очереди
	private int putloc, getloc; // Индексы вставки и извлечения
								// элементов очереди

	// Создание пустой очереди заданного размера
	public FixedQueue(int size) {
		q = new char[size + 1]; // выделить память для очередь
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	public void put(char ch)
		throws QueueFullException {
			
			if(putloc == q.length - 1)
				throw new QueueFullException(q.length - 1);

			putloc++;
			q[putloc] = ch;
		}

	// Извлечь символ из очереди
	public char get()
		throws QueueEmptyException {
		if(getloc == putloc)
			throw new QueueEmptyException();

		getloc++;
		return q[getloc];
		}
}

// Демонстрация исключений при работе с очередью
class QExcDemo {
	public static void main(String args[]) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;

		try {
			// Переполнение очереди
			for(i = 0; i < 11; i++) {
				System.out.print("Попытка сохранения: " + 
								(char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			// Попытка извлечь символ из пустой очереди
			for(i = 0; i < 11; i++) {
				System.out.print("Получение очередного символа: ");
				ch = q.get();
				System.out.println(ch);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}

