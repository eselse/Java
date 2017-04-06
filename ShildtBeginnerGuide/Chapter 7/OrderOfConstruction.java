// Демонстрация очередности вызова конструкторов.

// Создать суперкласс
class Ae {
	Ae() {
		System.out.println("Конструктор Ae");
	}
}

// Создать подкласс путем расширения класса Ae
class Be extends Ae {
	Be() {
		System.out.println("Конструктор Be");
	}
}

// Создать подкласс путем расширения класса Be
class Ce extends Be {
	Ce() {
		System.out.println("Конструктор Ce");
	}
}

class OrderOfConstruction {
	public static void main(String args[]) {
		Ce c = new Ce();
	}
}