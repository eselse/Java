// Использование ключевого слова throws
class ThrowsDemo {
	public static char prompt(String str)
		throws java.io.IOException { // обратите внимание на оператор throws в объявлении массива

			System.out.print(str + ": ");
			return (char) System.in.read();
		}

	public static void main(String args[]) {
		char ch;

		try {
			ch = prompt("Enter a letter");
		}	
		catch (java.io.IOException exc) {
			System.out.println("Произошло исключение ввода-вывода");
			ch = 'X';
		}
		System.out.println("Вы нажали клавишу " + ch);
	}
}