/*
	Упражнение 2.1

	Рассчитать расстояние до места вспышки молнии, звук от которого
	доходит до наблюдателя через 7,2 секунды.
*/
class Sound {
	public static void main(String args[]) {
		double dist;
		double mdist;

		dist = 1100 * 7.2;
		mdist = dist * 0.3048;


		System.out.println("Расстояние до места вспышки молнии " + 
							" составляет " + dist + " футов");
		System.out.println("Или " + mdist + " метров");
	}
}