/*
	Упражнение 5.1
	Демонстрация алгоритма пузырьковой сортировки
*/

class Bubble {
	public static void main(String args[]) {
		int nums[] = {99, -10, 100123, 18, -978,
						5623, 463, -9, 287, 49};

		int a, b, t;
		int size;

		size = 10; // количество сортируемых элементов

		// Отобразить исходный массив
		System.out.print("Исходный массив:");
		for(a = 1; a < size; a++) System.out.print(" " + nums[a]);
		System.out.println();

		// Реализовать алгоритм пузырьковой сортировки
		for(a = 1; a < size; a++)
			for(b = size - 1; b >= a; b--) {
				if(nums[b - 1] > nums[b]) { // если требуемый порядок
											// следования не соблюдается,
											// поменять элементы местами
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}

		// Отобразить отсортированный массив
		System.out.print("Отсортированный массив:");
		for(a = 1; a < size; a++) System.out.print(" " + nums[a]);
		System.out.println();
	}
}