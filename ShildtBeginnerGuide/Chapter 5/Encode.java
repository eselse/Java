// Использование поразрядной операции исключающего или
// для шифрования и дешифрования сообщений
class Encode {
	public static void main(String args[]) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 86;

		System.out.print("Исходное сообщение: ");
		System.out.println(msg);

		// Зашифровать сообщение
		for(int i = 0; i < msg.length(); i++)
			// Построение зашифрованной строки сообщения
			encmsg = encmsg + (char) (msg.charAt(i) ^ (key));

		System.out.print("Зашифрованное сообщение: ");
		System.out.println(encmsg);

		// Дешифровать сообщение
		for(int i = 0; i < msg.length(); i++)
			// Построение дешифровальной строки сообщения
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ (key));

		System.out.print("Дешифрованное сообщение: ");
		System.out.println(decmsg);
	}
}