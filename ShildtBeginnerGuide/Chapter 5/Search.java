// Поиск в массиве с использованием расширенного цикла for
class Search {
	public static void main(String args[]) {
		int nums[] = {6, 7, 8, 3, 5, 1, 4, 2, 10, 9};
		int val = 9;
		boolean found = false;

		// Использовать цикл for-each для поиска значения
		// переменной val в массиве nums
		for(int x : nums) {
			if(x == val) {
				found = true;
				break;
			}
		}

		if(found) System.out.println("Значение найдено!");
		else System.out.println("Такого значения нет!");
	}
}