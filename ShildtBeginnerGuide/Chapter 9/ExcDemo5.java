// В операторах catch исключения подкласса должны
// предшествовать исключениям суперкласса
class ExcDemo5 {
	public static void main(String args[]) {
		// Длина массива numer превышает длину массива denom
		int number[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for(int i = 0; i < number.length; i++) {
			try {
				System.out.println(number[i] + " / " +
									denom[i] + " равно " +
									number[i] / denom[i]);
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				// Перехватить исключение
				System.out.println("Соответствующий эдемент не найден");
			}
			catch (Throwable exc) {
				System.out.println("Возникло исключение");
			}
		}
	}
}