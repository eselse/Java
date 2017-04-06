/*
	Методы с разными сигнатурами не переопределяются,
	а перегружаются.
*/
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

// Создание подкласса путем расширения класса Ae
class Be extends Ae {
	int k;

	Be(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Перегрузить метод show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Overload {
	public static void main(String args[]) {
		Be subOb = new Be(1, 2, 3);

		subOb.show("k: "); // вызывается метод show() из класса Be
		subOb.show(); // вызывается метод show() из класса Ae
	}
}