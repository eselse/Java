// Применение метода substring()
class SubStr {
	public static void main(String args[]) {
		String orgStr = "Java - двигатель Интернета.";

		// Сформировать подстроку
		String substr = orgStr.substring(7, 26);

		System.out.println("orgStr: " + orgStr);
		System.out.println("substr: " + substr);
	}
}