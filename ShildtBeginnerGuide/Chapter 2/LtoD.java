// Демонстрация автоматического преобразования тпа long в тип double
class LtoD {
	public static void main(String args[]) {
		long L;
		double D;

		L = 100123285L;
		D = L;

		System.out.println("L и D: " + L + " " + D);
	}
}