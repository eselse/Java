// Применение оператора continue
class ContDemo {
	public static void main(String args[]) {
		int i;

		// Вывести четные числа в пределахот 0 до 100
		for(i = 0; i <= 20; i++) {
			if((i % 2) != 0) continue; // завершить шаг итерации цикла
				System.out.println(i);
		}
	}
}