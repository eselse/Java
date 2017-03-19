// Программа, считающая пробелы
class Spaces {
	// Первая версия
	// public static void main(String args[])
	// 	throws java.io.IOException {
	// 		char ch, ignore;
	// 		int spcs = 0;

	//		System.out.println("Пожалуйста введите строку символов (введите точку \".\" для выхода)");
	// 		do{
	// 			ch = (char) System.in.read();
	// 			if(ch == ' ') spcs++
	// 			do {
	// 				ignore = (char) System.in.read();
	// 				if(ignore == ' ') spcs++;
	// 			} while(ignore != '\n');
	// 		} while(ch != '.');
	// 		System.out.println("Общее количество введенных пробелов: " + spcs);
	// 	}


	// Вторая версия
	public static void main(String args[])
		throws java.io.IOException {
			char ch;
			int spaces = 0;

			System.out.println("Для остановки введите символ точки.");

			do{
				ch = (char) System.in.read();
				if(ch == ' ') spaces++;
			} while(ch != '.');

			System.out.println("Пробелов: " + spaces);
		}
}