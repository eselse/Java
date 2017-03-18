// Цикл for, выполняющийся с отрицательным приращением переменной
class DecrFor {
	public static void main(String args[]) {
		int x;

		for(x = 25; x > -25; x -= 5)
			System.out.println("| " + x);
	}
}