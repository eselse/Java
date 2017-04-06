// Использование ключевого слова super для предотвращения
// сокрытия имен
class A {
	int i;
}

// Создать подкласс, расширяющий класс A
class Be extends A {
	int i; // эта переменная i скрывает переменную i из класса A

	Be(int a, int b) {
		super.i = a; // переменная i из класса A
		i = b; // переменная i из класса B
	}

	void show() {
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе: " + i);
	}
}

class UseSuper {
	public static void main(String args[]) {
		Be subOb = new Be(1, 2);

		subOb.show();
	}
}