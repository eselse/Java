// Возврат объекта типа String
class ErrorMsg {
	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Выход индекса за границы диапазона"
	};

	String getErroMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Несуществующий код ошибки";
	}
}

class ErrMsg {
	public static void main(String args[]) {
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErroMsg(1));
		System.out.println(err.getErroMsg(19));
	}
}