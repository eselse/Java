// Обращение к объекту подкласса по ссылочной
// переменной суперкласса
class Xi {
	int a;

	Xi(int i) { a = i;}
}

class Ye extends Xi {
	int b;

	Ye(int i, int j) {
		super(j);
		b = i;
	}
}

class SupSubRef {
	public static void main(String args[]) {
		Xi x = new Xi(10);
		Xi x2;
		Ye y = new Ye(5, 6);

		x2 = x; // Допустимо, так как обе переменные одного типа
		System.out.println("x2.a: " + x2.a);

		x2 = y;  // По-прежнему допустимопо указанной выше причине
		System.out.println("x2.a: " + x2.a);

		// В классе Xi известны только члены класса Xi
		x2.a = 19; // допустимо
	 // x2.b = 27; // ошибка, так как переменная b не является члено класса Xi
	}
}