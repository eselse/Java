// Генерирование исключения вручную
class ThrowDemo {
	public static void main(String args[]) {
		try {
			System.out.println("До оператора throw");
			throw new IndexOutOfBoundsException();
		}
		catch (IndexOutOfBoundsException exc) {
			// Перехватить исключение
			System.out.println("Исключение перехвачено");
		}
		System.out.println("После блока try/catch");
	}
}