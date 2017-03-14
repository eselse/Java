// Упражнение 2.2
// Отображение таблицы истинности для логических операций
class LogicalOpTable {
	public static void main(String args[]) {
		boolean p, q;
		byte b = 0;

		System.out.println("    Таблица истинности для логических операций");

		System.out.println("-------------------------------------------------");
		System.out.println("| P\t| Q\t| AND\t| OR\t| XOR\t| NOT\t|");
		System.out.println("-------------------------------------------------");

		p = true; q = true;
		System.out.print("| " + p + "\t| " + q + "\t| ");
		System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		p = true; q = false;
		System.out.print("| " + p + "\t| " + q + "\t| ");
		System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		p = false; q = true;
		System.out.print("| " + p + "\t| " + q + "\t| ");
		System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		System.out.println((p ^ q) + "\t| " + (!p) + "\t|");

		p = false; q = false;
		System.out.print("| " + p + "\t| " + q + "\t| ");
		System.out.print((p & q) + "\t| " + (p | q) + "\t| ");
		System.out.println((p ^ q) + "\t| " + (!p) + "\t|");
		
		System.out.println("-------------------------------------------------");
	}
}