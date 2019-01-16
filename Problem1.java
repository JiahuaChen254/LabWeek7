import java.util.ArrayList;
import java.util.TreeSet;

public class Problem1 {
	
	private ArrayList<String> _alBooks;
	
	public Problem1() { // Constructor
		_alBooks = new ArrayList<String>();
	}
	
	public void addTitle(String title) {
		_alBooks.add(title);
	}
	
	public boolean inStock(String title) {
		return _alBooks.contains(title);
	}
	
	public void removeBook(String title) {
		_alBooks.remove(title);
	}
	
	public void displayStock() {
		for (String s : _alBooks) { // for-each method: for String s in _alBooks
			System.out.println(s);
		}
	}
	
	public TreeSet<String> getSortedTitles(){
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(_alBooks);
		return ts;
	}

	/* Alternative:
	public TreeSet<String> getSortedTitles(){
		return new TreeSet<String>(_alBooks);
	}
	*/
	
	public static void main(String[] args) {
		Problem1 bs = new Problem1();
		bs.addTitle("Huck Finn");
		bs.addTitle("Huck Finn");
		bs.addTitle("Huck Finn");
		bs.removeBook("Huck Finn");
		bs.addTitle("Tom Sawyer");
		System.out.println("In stock Huck Finn? " + bs.inStock("Huck Finn"));
		bs.displayStock();		
		System.out.println(bs.getSortedTitles());
	}
}

/* Will print out:
In stock Huck Finn? true
Huck Finn
Huck Finn
Tom Sawyer
[Huck Finn, Tom Sawyer]
*/
