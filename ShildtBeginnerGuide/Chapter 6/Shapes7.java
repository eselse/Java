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

	// Создать один объект на основе другого
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
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

	// Конструктор класса Triangle
	Triangle(String s, double w, double h) {
		super(w, h); // вызвать коструктор суперкласса

		style = s;
	}

	// Конструктор с одним аргументом для построения треугольника
	Triangle(double x) {
		super(x); // вызвать конструктор суперкласса

		style = "закрашенный";
	}

	// Создать один объект на основе другого
	Triangle(Triangle ob) {
		super(ob); // передача объекта конструктору класса Triangle
		style = ob.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class Shapes7 {
	public static void main(String args[]) {
		Triangle t1 =
			new Triangle("контурный", 8.0, 12.0);

		// создать копию объекта t1
		Triangle t2 = new Triangle(t1);

		System.out.println("Информация о t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь - " + t1.area());

		System.out.println();

		System.out.println("Информация о t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь - " + t2.area());
	}
}