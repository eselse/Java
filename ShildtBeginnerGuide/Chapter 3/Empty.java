// Пропуск отдельных составляющих в определении цикла for
class Empty {
	public static void main(String args[]) {
		int i;

		for(i = 0; i < 10; ) {
			System.out.println("Проход №" + i);
			i++; // инкрементировать переменную цикла
		}
	}
}