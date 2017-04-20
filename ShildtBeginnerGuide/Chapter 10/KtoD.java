// Пример простой утилиты для ввода данных с клавиатуры и
// записи их на диск, демонстрирующий использование класса
// FileWriter

import java.io.*;

class KtoD {
	public static void main(String args[]) {
		String str;
		BufferedReader br = 
			new BufferedReader (
				new InputStreamReader(System.in));

		System.out.println("Признак конца ввода - срока 'stop' ");

		try (FileWriter fw = new FileWriter("test.txt")) { // создание объекта FileWriter
			do{
				System.out.print(": ");
				str = br.readLine();

				if(str.compareTo("stop") == 0) break;

					str = str + "\r\n"; // добавить символы перевода строки
					fw.write(str);
			} while (str.compareTo("stop") != 0);
		}

		catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}