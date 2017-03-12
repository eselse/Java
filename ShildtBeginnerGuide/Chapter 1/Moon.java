/*
	Вычисление веса на Луне.

	Присвоить этому файлу имя Moon.java
*/
class Moon {
	public static void main(String args[]) {
		double earthweight; // вес на Земле
		double moonweight; // вес на Луне

		earthweight = 165; // значение веса на Земле в фунтах

		moonweight = earthweight * 0.17;

		System.out.println(earthweight + 
							" земных фунтов эквивалентны " +
							moonweight + " лунных фунтов.");
	}
}