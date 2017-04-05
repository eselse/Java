// Простой пример рекурсии
class Factiorial {
	// Рекурсивный метод
	int factR(int n) {
		int result;

		if(n == 1) return 1;
		result = factR(n - 1) * n;
		return result;
	}

	// Вариант программы, вычисляющий факториал итеративным способом
	int factI(int n) {
		int t, result;


		result = 1;
		for(t = 1; t <= n; t++) result *= t;
		return result;
 	}

 	// Рекурсивный метод для подсчета суммы всех чисел от 1 до d
 	int recSum(int d) {
 		int res;

 		if(d == 1) return 1;
 		res = recSum(d - 1) + d;
 		return res;
 	}
}

class Recursion {
	public static void main(String args[]) {
		Factiorial f = new Factiorial();

		System.out.println("Вычисление рекурсивным методом");
		System.out.println("Факториал 3 равен " + f.factR(3));
		System.out.println("Факториал 4 равен " + f.factR(4));
		System.out.println("Факториал 5 равен " + f.factR(5));
		System.out.println();

		System.out.println("Вычисление суммы всех чисел вплоть " + 
			"до полученного, рекурсивным способом");
		System.out.println("Сумма всех чисел от 1 до 10 равна " + f.recSum(10));
		System.out.println("Сумма всех чисел от 1 до 15 равна " + f.recSum(15));
		System.out.println("Сумма всех чисел от 1 до 5 равна " + f.recSum(5));
		System.out.println();

		System.out.println("Вычисление итеративным способом");
		System.out.println("Факториал 3 равен " + f.factI(3));
		System.out.println("Факториал 4 равен " + f.factI(4));
		System.out.println("Факториал 5 равен " + f.factI(5));
	}
}