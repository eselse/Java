// Использование интерфейсного метода по умолчанию
class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIFImp obj = new MyIFImp();
		MyIFImp2 obj2 = new MyIFImp2();
		MyIF mI;


		mI = obj;
		// Вызов метода getUserID() возможен, поскольку он явно
		// реализован классом MyIFImp
		System.out.println("Идентификатор пользователя: " +
			mI.getUserID());

		System.out.println("Универсальный идентификатор: " +
			MyIF.getUniversalID());

		// Вызов метода getAdminID() также возможен, поскольку
		// предоставляетсяего реализация по умолчанию
		System.out.println("Идентификатор администратора: " +
			mI.getAdminID());

		mI = obj2;
		// Вызов метода getUserID() возможен, поскольку он явно
		// реализован классом MyIFImp
		System.out.println("Идентификатор пользователя: " +
			mI.getUserID());

		// Вызов метода getAdminID() также возможен, поскольку
		// предоставляетсяего реализация по умолчанию
		System.out.println("Идентификатор администратора: " +
			mI.getAdminID());
	}
}