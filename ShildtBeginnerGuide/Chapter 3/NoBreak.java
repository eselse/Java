// Демонстрация использования оператора switch без оператора break
class NoBreak {
	public static void main(String args[]) {
		int i;

		for(i = 0; i <= 5; i++) {
			switch(i) {
				case 0:
					System.out.println("i равно нулю");
				case 1:
					System.out.println("i равно единице");
				case 2:
					System.out.println("i равно двум");
				case 3:
					System.out.println("i равно трем");
				case 4:
					System.out.println("i равно четырем");
			}
			System.out.println();
		}
	}
}