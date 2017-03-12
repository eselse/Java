// С символьными переменными можно обращаться, как с целочисленными
class CharArithDemo {
	public static void main(String args[]) {
		char ch;

		ch = 'X';
		System.out.println("ch содержит " + ch);

		ch++; // инкрементировать переменную ch
		System.out.println("теперь ch содержит " + ch);

		ch = 65; // присвоить переменной ch значение Z
		System.out.println("теперь ch содержит " + ch);

		// По тому же принципу выводим английский алфавит
		System.out.println("Вывести английский алфавит");
		for(int i = 0; i < 26; i++) System.out.print(ch++);
		System.out.println();
	}
}