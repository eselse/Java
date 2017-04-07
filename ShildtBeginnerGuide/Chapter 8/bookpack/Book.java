// Класс Book, видоизмененный для открытого доступа
package bookpack;

public class Book {
	// При объявлении этих пременных использован
	// модификатор доступа protected
	protected String title;
	protected String author;
	protected int pubDate;

	// Теперь конструктор стал открытым
	public Book(String t, String a, int p) {
		title = t;
		author = a;
		pubDate = p;
	}

	// Теперь метод стал открытым
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}