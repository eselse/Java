// Использование расширенного цикла for
// для обработки двумерного массива
class ForEach2 {
	public static void main(String args[]) {
		int sum = 0;
		int nums[][] = new int[3][5];

		// Ввести ряд значений в массив nums
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 5; j++)
				nums[i][j] = (i + 1) * (j + 1);

		// Использовать разновидность for-each цикла for
		// для суммирования и отображения значений.
		// Обратите внимание на объявление переменной x.
		for(int x[] : nums) { // Обратите внимание на способ объявления пременной x

			System.out.print("Значение: ");

			for (int y : x) {
				System.out.print(y + " ");
				sum += y;
			}
			
			System.out.println();
		}
		System.out.println("Сумма: " + sum);
	}
}