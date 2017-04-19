/*
	В этой версии программы ShowFile оператор try с ресурсами
	применяется для автоматического закрытия файла, когда в нем
	нет необходимости.
*/

import java.io.*;

class ShowFile3 {
	public static void main(String args[]) {
		int i;

		// Прежде всего необходимо убедиться в том, что программе
		// передаются имена обоих файлов
		if(args.length != 1) {
			System.out.println("Использование: ShowFile3 имя_файла");
			return;
		}

		// Использование try с ресурсами для открытия
		// файла с последующим его закрытием после того,
		// как будет покинут блок try
		try(FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);
		}

		catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}