// Наследование интерфейсов
interface A {
	void meth1();
	void meth2();
}

// Интерфейс B содержит методы meth1() и meth2(), а
// кроме того, в него добавляется метод meth3()
interface B extends A {
	void meth3();
}

// Этот класс должен реализовывать все методы,
// объявленные в интерфейсах A и B
class MyClass implements B {
	public void meth1() {
		System.out.println("Реализация метода meth1().");
	}

	public void meth2() {
		System.out.println("Реализация метода meth2().");
	}

	public void meth3() {
		System.out.println("Реализация метода meth3().");
	}
}

class IFExtend {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}