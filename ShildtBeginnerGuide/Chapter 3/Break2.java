// Чтение вводимых данных до тех пор, пока не будет получена буква q
class Break2 {
	public static void main(String args[])
		throws java.io.IOException {
			char ch, ignore;

			for(;;)	{
				// System.out.println("Нажмите клавишу \'q\'");
				ch = (char) System.in.read(); // получить символ с клавиатуры
				// do{
				// 	ignore = (char) System.in.read();
				// } while(ignore != '\n');
				if(ch == 'q') break;
			}
			System.out.println("Вы нажали клавишу q!");
		}
}