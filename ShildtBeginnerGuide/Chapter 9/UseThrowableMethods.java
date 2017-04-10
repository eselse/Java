// Использование методов класса Throwable
class ExcTest {
	static void genException() {
		int nums[] = new int[4];

		System.out.println("До генерации исключения");

		// Сгенерировать исключение в связи с
		// выходом индекса за границы массива
		nums[7] = 10;
		System.out.println("Эта строка не будет отображаться");
	}
}

class UseThrowableMethods {
	public static void main(String args[]) {
		
		try {
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// перехватить исключение
			System.out.println("Стандартное сообщение: ");
			System.out.println(exc);
			System.out.println("\nСтек вызовов: ");
			exc.printStackTrace();
		}
		System.out.println("После оператора catch");
	}
}