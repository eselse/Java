// Тело цикла for может быть пустым
class Empty3 {
	public static void main(String args[]) {
		int i;

		int sum = 0;
		for(i = 1; i <= 5; sum += i++) ; // в цикде отсутствует тело

		System.out.println("Сумма: " + sum);
	}
}