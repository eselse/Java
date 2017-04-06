// Простая иерархия классов

// Класс, описывающий двумерные объекты
class TwoDShape {
	double width;
	double height;

	void showDim() {
		System.out.println("Ширина и высота - " + 
							width + " и " + height);
	}
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle extends TwoDShape {
	String style;

	double area() {
		return width * height / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
class Rectangle extends TwoDShape {
	boolean isSquare() {
		if(width == height) return true;
		return false;
	}

	double area() {
		return width * height;
	}
}


class Shapes {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		boolean res;

		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "закрашенный";

		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "контурный";

		r1.width = 12.0;
		r1.height = 10.0;

		r2.width = 10.0;
		r2.height = 10.0;

		System.out.println("Информация о t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь - " + t1.area());

		System.out.println();

		System.out.println("Информация о t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь - " + t2.area());

		System.out.println();

		System.out.println("Информация о r1: ");
		res = r1.isSquare();
		System.out.println("Площадь - " + r1.area());
		System.out.println("Квадрат? : " + res);

		System.out.println();

		System.out.println("Информация о r2: ");
		res = r2.isSquare();
		System.out.println("Площадь - " + r2.area());
		System.out.println("Квадрат? : " + res);
	}
}