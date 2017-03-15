// Вывод всех делителей чисел от 1 до 100
class Dividers {
	public static void main(String args[]) {
		int i, j;
		boolean b, c;

		for(i = 1; i <= 100; i++) {
			System.out.print(i);
			b = c = true;
			for(j = 2; j <= i / 2; j++){
				if((i % j) == 0 & b) {
					System.out.print(" - ");
					b = false;
				}
				if((i % j) == 0) {
					if(c) {
						System.out.print(j);
						c = false;
					} else {
						System.out.print(", " + j);
					}
				}
			}
			if(i == 2 | (i % j) != 0 & b)
				System.out.print(" - простое число");
			System.out.println();
		}
	}
}