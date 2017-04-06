// Использование методов доступа для установки и
// получения значений закрытых членов.

// Класс, описывающий двумерные объекты
class TwoDShape {
	private double height; // теперь эти переменные
	private double width; // объявлены как закрытые

	// Методы доступа к закрытым переменным экземпляра width и height
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w;}
	void setHeight(double h) {height = h;}

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
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class Shapes2 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "Закрашенный";

		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "Контурный";

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