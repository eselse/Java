/*
	Версия программы CopyFile, в которой используется оператор
	try с ресурсами. В ней демонстрируется управление двумя ресурсами
	(в данном случае - файлами) с помощью единственного оператора try.
*/

import java.io.*;

class CopyFile2 {
	public static void main(String args[]) throws IOException {
		int i;

		// Прежде всего необходимо убедится в том, что программе
		// передаются имена обоих файлов
		if(args.length != 2) {
			System.out.println("Использование: CopyFile откуда куда");
			return;
		}

		// Открытие двух файлов и управление ими с помощью оператора try
		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1])) {
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}