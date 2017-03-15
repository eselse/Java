// Вывод всех делителей чисел от 1 до 100
class Dividers {
	public static void main(String args[]) {
		int i, j, cnt;
		boolean b;

		for(i = 1; i <= 100; i++) {
			System.out.print(i);
			b = true;
			cnt = 1;
			for(j = 2; j <= i / 2; j++){
				if((i % j) == 0 & b) {
					System.out.print(" - ");
					b = false;
				}
				if((i % j) == 0) {
					if(cnt == 1) {
						System.out.print(j);
						cnt++;
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