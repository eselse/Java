class Factor {
	boolean isFactor(int a, int b) {
		if((b % a) == 0) return true;
		else return false;
	}
}

class IsFact {
	public static void main(String args[]) {
		Factor x = new Factor();

		if(x.isFactor(2, 20)) System.out.println("2 - делитель 20");

		if(x.isFactor(3, 99)) System.out.println("3 - делитель 99");

		if(x.isFactor(14, 99)) System.out.println("14 - делитель 99");
	}
}