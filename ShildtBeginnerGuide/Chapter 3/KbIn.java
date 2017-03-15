// Чтение символа с клавиатуры
class KbIn {
	public static void main(String args[])
		throws java.io.IOException {

			char ch;

			System.out.print("нажмите нужную клавишу, а затем" +
							" клавишу ENTER\u23CE: ");

			ch = (char) System.in.read(); // получить символ

			System.out.println("Вы нажали клавишу " + ch);
	}
}