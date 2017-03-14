// Неожиданный результат повышения типов!
class PromDemo {
	public static void main(String args[]) {
		byte b;
		int i;

		char ch1 = 'a', ch2 = 'b';

		// ch1 = (char) (ch1 + ch2);
		// System.out.println(ch1);

		b = 10;
		i = b * b;

		b = 10;
		b = (byte) (b * b); // Требуется явно указать возвращаемый тип!
		// b = b * b; // Ошибка possible lossy conversion from int to byte

		System.out.println("i and b: " + i + " " + b);

	}
}