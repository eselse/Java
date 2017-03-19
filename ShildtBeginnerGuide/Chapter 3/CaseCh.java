// Смена регистра символов
class CaseCh {
	public static void main(String args[])
		throws java.io.IOException {

			// Первая версия

			// char ch;
			// int cntCh = 0;

			// System.out.println("Пожалуйста введите строку символов (введите точку \".\" для выхода)");
			// do{
			// 	ch = (char) System.in.read();
			// 	if(ch <= 'Z' & ch >= 'A') {
			// 		ch = ((char) (ch - 32));
			// 		cntCh++;
			// 	}
			// 	else if(ch <= 'z' & ch >= 'a') {
			// 		ch = ((char) (ch + 32));
			// 		cntCh++;
			// 	}
			// } while(ch != '.');
			// System.out.println("Работа программы была завершена, преобразовано " + cntCh + " символов.");


			// Вторая версия

			char ch;
			int changes = 0;


			System.out.println("Для остановки введите символ точки.");

			do{
				ch = (char) System.in.read();
				if(ch >= 'a' & ch <= 'z') {
					ch -= 32;
					changes++;
					System.out.print(ch);
				}
				else if(ch >= 'A' & ch <= 'Z') {
					ch += 32;
					changes++;
					System.out.print(ch);
				}
			} while(ch != '.');
			System.out.println("Изменение регистра: " + changes);
		}
}