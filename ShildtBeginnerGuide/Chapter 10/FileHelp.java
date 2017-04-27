/*
	Упражнение 10.2

	Справочная система, использующая дисковый файл
	для хранения информации
*/

import java.io.*;

/*
	В классе Help открывается файл со справочной информацией,
	производится поиск указанной темы, а затем отображается
	справочная информация. Обратите внимание на то, что данный
	класс обрабатывает все исключения, освобождая от этого
	вызывающий код.
*/

class Help {
	String helpfile; // имя файла, содержащего
					 // справочную информацию
	Help(String fname) {
		helpfile = fname;
	}

	// Отобразить справочную информацию по указанной теме
	boolean helpOn(String what) {
		int ch;
		String topic, info;

		// Открыть справочный файл
		try (BufferedReader helpRdr = 
			new BufferedReader(new FileReader(helpfile))) {
			do {
				// Читать символы до тех пор, пока не встретится символ #
				ch = helpRdr.read();
				// Проверить, совпадают ли темы
				if(ch == '#') {
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0) { // найти тему
						do {
							info = helpRdr.readLine();
							if(info != null) System.out.println(info);
						}
						while ((info != null) &&
							(info.compareTo("") != 0));
							return true;
					}
				}
			}
			while (ch != -1);
		}
		catch (IOException exc) {
			System.out.println("Ошибка при попытке доступа к файлу справки");
			return false;
		}
		return false; // тема не найдена
	}


	// Получить тему справки.
	String getSelection() {
		String topic = "";

		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.print("Укажите тему: ");
		try {
			topic = br.readLine();
		}
		catch(IOException exc) {
			System.out.println("Ошибка при чтении с консоли");
		}
		return topic;
	}
}

// Демонстрация работы справочной системы на основе файла
class FileHelp {
	public static void main(String args[]) {
		Help hlpobj = new Help("helpfile.txt");
		String topic;

		System.out.println("Воспользуйтесь справочной системой. \n" +
							"для выхода из системы введите 'stop'.");
		do {
			topic = hlpobj.getSelection();

			if(!hlpobj.helpOn(topic))
				System.out.println("Тема не найдена.\n");
		}
		while (topic.compareTo("stop") != 0);
	}
}