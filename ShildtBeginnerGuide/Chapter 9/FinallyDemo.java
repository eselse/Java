// Использование блока finally
class UseFinally {
	public static void genException(int what) {
		int t;
		int nums[] = new int[2];

		System.out.println("Получено: " + what);
		try {
			switch(what) {
				case 0:
					t = 10 / what; // сгенерировать ошибку деления на нуль
					break;
				case 1:
					nums[4] = 4; // сгенерировать ошибку обращения к массиву
					break;
				case 2:
					return; // возвратится из блока try
			}
		}
		catch (ArithmeticException exc) {
			// Перехватить исключение
			System.out.println("Попытка деления на нуль");
			return; // вернуться из блока catch
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			// Перехватить исключение
			System.out.println("Соотетствующий элемент не найден");
		}
		finally {
			System.out.println("Выполнение блока finally");
		}
	}
}

class FinallyDemo {
	public static void main(String args[]) {
		
		for(int i = 0; i < 3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}