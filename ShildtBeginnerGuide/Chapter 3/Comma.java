// Применение запятых в операторе цикла for
class Comma {
	public static void main(String args[]) {
		int i, j;

		for(i = 0, j = 25; i < j; i++, j--) // для управления этим циклом используются две переменные
			System.out.println("i и j: " + i + " " + j);
	}
}