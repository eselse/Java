class SeriesDemo {
	public static void main(String args[]) {
		ByTwos ob = new ByTwos();
		ByThrees ob2 = new ByThrees();

		for(int i = 0; i < 5; i++)
			// System.out.println("Следующее значение: " +
			// 					ob.getNext());
			System.out.println("Следующее значение: " +
								ob2.getNext());

		System.out.println("\nСброс");
		ob.reset();
		for(int i = 0; i < 5; i++)
			System.out.println("Следующее значение: " + 
								ob.getNext());

		System.out.println("\nНачальное значение: 100");
		ob.setStart(100);
		for(int i = 0; i < 5; i++)
			System.out.println("Следующее значение: " + 
								ob.getNext());

	}
}