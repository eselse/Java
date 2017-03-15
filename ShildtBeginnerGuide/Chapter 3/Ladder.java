// Демонстрация многоступенчатой конструкции if-else-if
class Ladder {
	public static void main(String args[]) {
		int x;

		for(x = 0; x < 6; x++) {
			if(x == 1)
				System.out.println("х равно одному");
			else if(x == 2)
				System.out.println("х равно двум");
			else if(x == 3)
				System.out.println("х равно трем");
			else if(x == 4)
				System.out.println("х равно четырем");
			else
				// условие, выполняемое по умолчанию
				System.out.println("Значение х находится вне диапазона 1 - 4");
		}
	}
}