// Использование вложенных блоков try
class NestTrys {
	public static void main(String args[]) {
		// Длина массива number превышает длину массива denom
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		try { // Внешний блок try
			for(int i = 0; i < number.length; i++) {
				try { // внутренний блок try
					System.out.println(number[i] + " / " +
									denom[i] + " равно " + 
									number[i] / denom[i]);
				}
				catch (ArithmeticException exc) {
					// Перехватить исключение
					System.out.println("Попытка деления на нуль");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// Перехватить исключение
			System.out.println("Соответствующий элемент не найден");
			System.out.println("Фатальная ошибка - выполнение " + 
								"программы прервано!");
		}
	}	
}