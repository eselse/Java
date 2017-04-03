// Использование переменной экземпляра length
class LengthDemo {
	public static void main(String args[]) {
		int list[] = new int[10];
		int nums[] = {1, 2, 3};
		int table[][] = { // Таблица со строками переменной длины
			{1, 2, 3},
			{4, 5},
			{6, 7, 8, 9}
		};

		System.out.println("Размер списка: " + list.length);
		System.out.println("Размер nums: " + nums.length);
		System.out.println("Размер table[0]: " + table[0].length);
		System.out.println("Размер table[1]: " + table[1].length);
		System.out.println("Размер table[2]: " + table[2].length);
		System.out.println();

		// Использовать переменную length для инициализации списка
		for(int i = 0; i < table[2].length; i++) table[2][i] *= table[2][i];

		System.out.print("Содержимое table[2]: ");
		for(int i = 0; i < table[2].length; i++) System.out.print(table[2][i] + " ");
		System.out.println();
	}
}