/*
    Копирование текстового файла с заменой пробелов дефисами.

    В этой версии программы используются символьные потоки.

    Для того чтобы воспользоваться это программой, укажите
    в командной строке имена исходного и целевого файлов. Например:

    java Hyphen2 source target

    Для компиляции этого кода требуется JDK 7
    или более поздняя версия данного комплекта.
*/

import java.io.*;

class Hyphen2 {
    public static void main(String args[]) throws IOException {
        int i;

        // Сначала проверить, указаны ли имена обоих файлов
        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        // Скопировать файл и заменить в нем пробелы дефисами,
        // используя оператор try с ресурсами
        try (FileReader fin = new FileReader(args[0]);
            FileWriter fout = new FileWriter(args[1])) {

            do {
                i = fin.read();

                // преобразовать пробел в дефис
                if((char) i == ' ') i = '-';

                if(i != -1) fout.write(i);
            }
            while(i != -1);
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода:" + exc);
        }
    }
}