// Демонстрация обработки исключений
class ExcDemo1 {
	public static void main(String args[]) {
		int nums[] = new int[4];
		int n, z;
		n = 10;
		z =  0;

		try { // создается блок try
			System.out.println("До генерации исключения");

			nums[7] = 10; // попытка использовать индекс, выходящий за границы массива
			System.out.println("Эта строка не будет отображаться");
		}

		catch (ArrayIndexOutOfBoundsException exc) { // перехват исключений
			System.out.println("Выход за границы массива!");
		}
		System.out.println("После оператора catch");

		System.out.println();

		try { // создается блок try
			System.out.println("До генерации исключения");

			n = n / z; // попытка использовать индекс, выходящий за границы массива
			System.out.println("Эта строка не будет отображаться");
		}

		catch (ArithmeticException exc) { // перехват исключений
			System.out.println("Ошибка! Деление на нуль!");
		}
		System.out.println("После оператора catch");
	}
}