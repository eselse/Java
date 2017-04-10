// Повторное генерирование исключений
class Rethrow {
	public static void genException() {
		// Длина массива number превышает длину массива denom
		int number[] = { 4, 8, 16, 32, 64 ,128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for(int i = 0; i < number.length; i++) {
			try {
				System.out.println(number[i] + " / " +
									denom[i] + " равно " +
									number[i] / denom[i]);
			}
			catch (ArithmeticException exc) {
				// Перехватить исключение
				System.out.println("Попытка деления на нуль");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				// Перехватить исключение
				System.out.println("Соответствующий элемент не найден");
				throw exc; // повторно сгенерировать исключение
			}
		}
	}
}

class RethrowDemo {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// Повторно перехватить исключение
			System.out.println("Фатальная ошибка - " + 
								"выполнение программы прервано!");
		}
	}
}