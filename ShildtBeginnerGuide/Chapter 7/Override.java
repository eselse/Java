// Переопределение метода
class Ae {
	int i, j;
	Ae(int a, int b) {
		i = a;
		j = b;
	}

	// Отобразить переменные i и j
	void show() {
		System.out.println("i и j: " + i + " " + j);
	}
}

class Be extends Ae {
	int k;

	Be(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Отобразить переменные i и j
	void show() {
		System.out.println("k: " + k);
	}

}

class Override {
	public static void main(String args[]) {
		Be subOb = new Be(1, 2, 3);

		subOb.show(); // вызвать метод show() из класса B
	}
}