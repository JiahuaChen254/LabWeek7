import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Problem2 {
	
	private Map<String, Integer> _mBooks;
	
	public Problem2() { // Constructor
		_mBooks = new HashMap<String, Integer>();
	}
	
	// Add a title to the bookstore's stock
	public void addTitle(String title) {
		if (_mBooks.get(title) == null) {
			_mBooks.put(title, 1);
		}
		else {
			_mBooks.put(title, (_mBooks.get(title) + 1));
		}
	}
	
	// See if a bookstore has a book in stock (true/false)
	public boolean inStock(String title) {
		return _mBooks.containsKey(title);
	}
	
	// Remove a book from stock (for simplicity, if a book is not in stock, this method has no effect)
	public void removeBook(String title) {
		if (_mBooks.get(title) == 1) {
			_mBooks.remove(title);
		}
		else {
			_mBooks.put(title, (_mBooks.get(title) - 1));
		}
	}
	
	// Display all existing stock on the console output (System.out)
	public void displayStock() {
		for (String s : _mBooks.keySet()) { // for-each method: for String s in _mBooks
			System.out.println(s);
		}
	}
	
	// Return a sorted set of unique titles that the bookstore has in stock
	// (no duplicates, sort in the natural alphabetical order of String)
	public TreeSet<String> getSortedTitles(){
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(_mBooks.keySet());
		return ts;
	}

	/* Alternative:
	public TreeSet<String> getSortedTitles(){
		return new TreeSet<String>(_mBooks.keySet());
	}
	*/
	
	public static void main(String[] args) {
		Problem2 bs = new Problem2();
		bs.addTitle("Ugly Ducklings");
		bs.addTitle("Huck Finn");
		bs.addTitle("Huck Finn");
		bs.addTitle("Tom Sawyer");
		bs.addTitle("Huck Finn");
		bs.addTitle("Tom Sawyer");
		System.out.println("Before removal of Huck Finn? ");	
		bs.displayStock();
		System.out.println(bs._mBooks.entrySet());
		bs.removeBook("Huck Finn");
		System.out.println("After removal of Huck Finn once? ");
		bs.displayStock();
		System.out.println(bs._mBooks.entrySet());
		bs.removeBook("Ugly Ducklings");
		System.out.println("After removal of Ugly Ducklings once? "); 
		bs.displayStock();
		System.out.println(bs._mBooks.entrySet());
		System.out.println("In stock Huck Finn? " + bs.inStock("Huck Finn"));	
		System.out.println("In stock Tom Sawyer? " + bs.inStock("Tom Sawyer"));
		System.out.println("In stock Ugly Ducklings? " + bs.inStock("Ugly Ducklings"));
		System.out.println(bs.getSortedTitles());
	}
}

/* Will print out:
Before removal of Huck Finn? 
Huck Finn
Tom Sawyer
Ugly Ducklings
[Huck Finn=3, Tom Sawyer=2, Ugly Ducklings=1]
After removal of Huck Finn? 
Huck Finn
Tom Sawyer
Ugly Ducklings
[Huck Finn=2, Tom Sawyer=2, Ugly Ducklings=1]
In stock Huck Finn? true
In stock Tom Sawyer? true
[Huck Finn, Tom Sawyer, Ugly Ducklings]
*/
