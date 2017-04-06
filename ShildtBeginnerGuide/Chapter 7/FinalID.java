// Возврат объекта типа String
class ErrorMsg {
	// Коды ошибок.
	// Константы объявляются с помощью ключевого слова final
	final int OUTERR = 0;
	final int INNER = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;

	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Выход инекса за границы массива"
	};

	// Возвратить сообщение об ошибке
	String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Несуществующий код ошибки";
	}
}

class FinalID {
	public static void main(String args[]) {
		ErrorMsg err = new ErrorMsg();

		// При вызове метода используются константы,
		// объявленные с помощью ключевого слова final
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.INDEXERR));
	}
}