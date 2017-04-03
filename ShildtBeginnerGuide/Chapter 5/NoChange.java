// Циклы for-each предназначены только для чтения
class NoChange {
	public static void main(String args[]) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println("Попытаемся внести изменения в массив" + 
						" с помощью изменения переменной цикла for each x");
		for(int x : nums) {
			System.out.print(x + " ");
			x = x * 10; // Эта операция не изменяет содержимое массива nums
		}

		System.out.println();

		for(int x : nums) System.out.print(x + " ");
		System.out.println();
		System.out.println("Как мы можем видеть массив остался без изменений");
	}
}