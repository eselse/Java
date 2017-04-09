// Эта программа не будет работать!
class ExcTypeMismatch {
	public static void main(String args[]) {
		int nums[] = new int[4];

		try {
			System.out.println("До генерации исключения");

			// Сгенерировать исключение в связи
			// с выходом индекса за границы массива
			nums[7] = 10;
			System.out.println("Эта строка не будет отображаться");
		}
		/*
			Исключение, всязанное с обращением за границы массива,
			нельзя обработать с помощью оператора catch в котором
			указан тип исключения ArithmeticException.
		*/
		catch (ArithmeticException exc) {
			// Перехватить исключение
			System.out.println("Выход за границы массива!");
		}
		System.out.println("После оператора catch");
	}
}