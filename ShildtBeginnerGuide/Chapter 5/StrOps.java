// Некоторые операции над строками
class StrOps {
	public static void main(String args[]) {
		String str1 = 
		"Java - лидер Интернета!";
		String str2 = new String(str1);
		String str3 = "Строки Java эффективны.";
		int result, idx;
		char ch;

		System.out.println("Длина str1: " +
							str1.length());

		// Отобразить строку str1 посимвольно
		for(int i = 0; i < str1.length(); i++)
			System.out.print(str1.charAt(i));
		System.out.println();

		if(str1.equals(str2))
			System.out.println("str1 эквивалентна str2");
		else
			System.out.println("str1 неэквивалентна str2");

		if(str1.equals(str3))
			System.out.println("str1 эквивалентна str3");
		else
			System.out.println("str1 неэквивалентна str3");

		result = str1.compareTo(str3);
		if(result == 0)
			System.out.println("str1 и str3 равны");
		else if(result < 0)
			System.out.println("str1 меньше str3");
		else
			System.out.println("str1 больше str3");

		// Присвоить переменной str2 новую строку
		str2 = "One Two Three Four Two";

		idx = str2.indexOf("Two");
		System.out.println("Индекс первого вхождения Two: " + idx);
		idx = str2.lastIndexOf("Two");
		System.out.println("Индекс последнего вхождения Two: " + idx);
	}
}