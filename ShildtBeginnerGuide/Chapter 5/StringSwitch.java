// Использование строк для управления оператором switch
class StringSwitch {
	public static void main(String args[]) {
		String command = "connect";

		switch(command) {
			case "connect" :
				System.out.println("Подключение");
				break;
			case "cancel" :
				System.out.println("Отмена");
				break;
			case "disconnect" :
				System.out.println("Отключение");
				break;
			default:
				System.out.println("Неверная команда");
				break;
		}	
	}
}