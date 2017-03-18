// Демонстрация использования оператора switch
class SwitchDemo {
	public static void main(String args[]) {
		int i;

		for(i = 0; i < 5; i++)
			switch(i){
				case 0:
					System.out.println("i равно нулю");
				    break;
				case 1:
					System.out.println("i равно единице");
				    break;
				case 2:
					System.out.println("i равно двум");
				    break;
				case 3:
					System.out.println("i равно трем");
				    break;
				case 4:
					System.out.println("i равно или больше пяти");
				    break;
				default:
			}
			System.out.println();

		// Проверка типов совместимых с оператором switch
		byte a;

		for(a = 0; a < 5; a++)
			switch(a) {
				case 0:
					System.out.println("a равно нулю");
				    break;
				case 1:
					System.out.println("a равно единице");
				    break;
				case 2:
					System.out.println("a равно двум");
				    break;
				case 3:
					System.out.println("a равно трем");
				    break;
				case 4:
					System.out.println("a равно или больше пяти");
				    break;
				default:
					System.out.println("a больше пяти");
			}
			System.out.println();

		double f;

		for(f = 0.0; f < 4.0; f++)
			switch((int) (f)) {
				case 1:
					System.out.println("f равно 0.08");
				    break;
				case 2:
					System.out.println("f равно 0.16");
				    break;
				case 3:
					System.out.println("f равно 0.24");
				    break;
				case 4:
					System.out.println("f равно 0.32");
				    break;
				case 5:
					System.out.println("f равно 0.40");
				    break;
				default:
					System.out.println("f больше единицы");
			}
			System.out.println();

		String str;

			str = "Пьеро";
			switch(str) {
				case "Буратино":
					System.out.println("str равно \"Буратино\"");
				    break;
				case "Мальвина":
					System.out.println("str равно \"Мальвина\"");
				    break;
				case "Пьеро":
					System.out.println("str равно \"Пьеро\"");
				    break;
				case "Базилио":
					System.out.println("str равно \"Базилио\"");
				    break;
				case "Карабас-Барабас":
					System.out.println("str равно \"Карабас-Барабас\"");
				    break;
				default:
					System.out.println("str неизвестно");
			}
			System.out.println();

		char ch;

			ch = 'a';
			for(i = 0; i < 15; i++) {
				switch(ch) {
					case 'a':
						System.out.println("ch равно a");
					    break;
					case 'b':
						System.out.println("ch равно b");
					    break;
					case 'c':
						System.out.println("ch равно c");
					    break;
					case 'd':
						System.out.println("ch равно d");
					    break;
					case 'e':
						System.out.println("ch равно e");
					    break;
					case 'f':
						System.out.println("ch равно f");
					    break;
					case 'g':
						System.out.println("ch равно g");
					    break;
					case 'h':
						System.out.println("ch равно h");
					    break;
					case 'i':
						System.out.println("ch равно i");
					    break;
					case 'j':
						System.out.println("ch равно j");
					    break;
					case 'k':
						System.out.println("ch равно k");
					    break;
					case 'l':
						System.out.println("ch равно l");
					    break;
					case 'm':
						System.out.println("ch равно m");
					    break;
					case 'n':
						System.out.println("ch равно n");
					    break;
					case 'o':
						System.out.println("ch равно o");
					    break;
					case 'p':
						System.out.println("ch равно p");
					    break;
					case 'q':
						System.out.println("ch равно q");
					    break;
					default:
						System.out.println("ch неизвестно");
				}
				ch++;
			}
	}
}