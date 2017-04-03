// Использование разновидности for-each цикла for для вычисления факториала
class FactForEach {
	public static void main(String args[]) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7};
		int sum = 1;

		// Использовать разовидность for-each цикла for
		// для суммирования и отображения значений
		for(int x : nums) {
			System.out.println("Значение: " + x);
			sum *= x;
		}

		System.out.println("Факториал: " + sum);
	}
}