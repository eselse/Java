// Параметризированный конструктор
class MyClass {
	int x;

	MyClass(int i) {
		x = i;
	}
}

class ParamConsDemo {
	public static void main(String args[]) {
		MyClass t1 = new MyClass(12);
		MyClass t2 = new MyClass(88);

		System.out.println(t1.x + "/" + t2.x);
	}
}