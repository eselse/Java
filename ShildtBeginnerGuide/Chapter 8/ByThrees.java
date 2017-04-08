// Ещё одна реализация интерфейса Series
class ByThrees implements Series {
	int start;
	int val;

	ByThrees() {
		start = 0;
		val = 0;
	}

	public int getNext() {
		val += 3;
		return val;
	}

	public void reset() {
		start = val = 0;
	}

	public void setStart(int x) {
		start = x;
		val = x;
	}
}
