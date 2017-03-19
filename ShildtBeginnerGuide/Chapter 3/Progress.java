/*
	Использование цикла for для формирования
	геометрической прогрессии 1, 2, 4, 8, 16, 32 и т.д.
*/
class Progress {
	public static void main(String args[]) {

		// for(int i = 1; i < 1025; i *= 2){
		// 	System.out.println(i);
		// }

		for(int i = 1; i < 1025; i += i){
			System.out.println(i);
		}

	}
}