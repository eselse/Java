/*
	Рассчитать расстояние до объекта путем замера времени прохода звука
	в направлении целевого объекта и возвращении его обратно
*/
class Echo {
	public static void main(String args[]) {
		double dist;
		double mdist;

		dist = 1100 * 4.0 * 2;
		mdist = dist * 0.3048;


		System.out.println("Расстояние до объекта " + 
							" составляет " + dist + " футов");
		System.out.println("Или " + mdist + " метров");
	}
}