// Демонстрация использования цикла while
class WhileDemo {
	public static void main(String args[]) {
		char ch;

		// вывести буквы английского алфавита, используя цикл while
		ch = 'A';
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
	}
}