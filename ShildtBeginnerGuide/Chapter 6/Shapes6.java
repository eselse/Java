// Многоуровневая иерархия
class TwoDShape {
	private double width;
	private double height;

	// Конструктор по умолчанию
	TwoDShape() {
		width = height = 0.0;
	}

	// Параметризированный конструктор
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Создать объект с одинаковыми значениями
	// переменных экземпляра width и height
	TwoDShape(double x) {
		width = height = x;
	}

	// Методы доступа к переменным экземпляра width и height
	double getWidth () { return width; }
	double getHeight () { return height; }
	void setWidth(int w) { width = w; }
	void setHeight(int h) { height = h; }

	void showDim() {
		System.out.println("Ширина и высота - " +
						width + " и " + height);
	}
}

// Расширение класса TwoDShape
class Triangle extends TwoDShape {
	private String style;

	// Конструктор по умолчанию
	Triangle() {
		super();
		style = "none";
	}

	Triangle(String s, double w, double h) {
		super(w, h); // вызвать коструктор суперкласса

		style = s;
	}

	// Конструктор с одним аргументом для построения треугольника
	Triangle(double x) {
		super(x); // вызвать конструктор суперкласса

		style = "закрашенный";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

// Расширение класса Triangle
class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle(String c, String s,
				  double w, double h) {
		super(s, w, h);

		color = c;
	}

	String getColor() { return color; }

	void showColor() {
		System.out.println("Цвет - " + color);
	}
}

class Shapes6 {
	public static void main(String args[]) {
		ColorTriangle t1 =
			new ColorTriangle("Синий", "контурный", 8.0, 12.0);
			
		ColorTriangle t2 = 
			new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

		System.out.println("Информация о t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Площадь - " + t1.area());

		System.out.println();

		System.out.println("Информация о t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Площадь - " + t2.area());
	}
}