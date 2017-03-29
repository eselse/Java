// Демонстрация превышения границ массива
class ArrayErr {
	public static void main(String args[]) {
		int sample[] = new int[10];
		int i;

		// Искуственно создать выход индекса за границы массива
		for(i = 0; i < 100; i++) sample[i] = i;
	}
}