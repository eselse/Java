// Упражнение 2.3
// Отображение таблицы истинности для логических операций
class LogicalOpTableNum {
	public static void main(String args[]) {
		boolean p, q;
		byte b = 0;

		System.out.println("    Таблица истинности для логических операций");

		System.out.println("-------------------------------------------------");
		System.out.println("| P\t| Q\t| AND\t| OR\t| XOR\t| NOT\t|");
		System.out.println("-------------------------------------------------");

		// p = true; q = true;
		// System.out.print("| " + p + "\t| " + q + "\t| ");
		// System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		// System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		// p = true; q = false;
		// System.out.print("| " + p + "\t| " + q + "\t| ");
		// System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		// System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		// p = false; q = true;
		// System.out.print("| " + p + "\t| " + q + "\t| ");
		// System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		// System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		// p = false; q = false;
		// System.out.print("| " + p + "\t| " + q + "\t| ");
		// System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		// System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		p = true; q = true;
		if(p) b = 1;
		System.out.print("| " + b + "\t| ");
		b = 0;
		if(q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p & q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p | q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p ^ q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(!p) b = 1;
		System.out.println(b + "\t|");

		p = true; q = false;
		if(p) b = 1;
		System.out.print("| " + b + "\t| ");
		b = 0;
		if(q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p & q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p | q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p ^ q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(!p) b = 1;
		System.out.println(b + "\t|");

		p = false; q = true;
		if(p) b = 1;
		System.out.print("| " + b + "\t| ");
		b = 0;
		if(q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p & q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p | q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p ^ q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(!p) b = 1;
		System.out.println(b + "\t|");

		p = false; q = false;
		if(p) b = 1;
		System.out.print("| " + b + "\t| ");
		b = 0;
		if(q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p & q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p | q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(p ^ q) b = 1;
		System.out.print(b + "\t| ");
		b = 0;
		if(!p) b = 1;
		System.out.println(b + "\t|");


		System.out.println("-------------------------------------------------");
	}
}