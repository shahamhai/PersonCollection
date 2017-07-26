import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;


public class PersonCollection extends Observable {
	private List<Person> persons = new ArrayList<Person>();
	private Comparator<Person> comparator = new MyComparator(); // create other comparator to change person value
	
	public void add(Person p){
		persons.add(p);
		persons.sort(comparator); // WC is O(n log n) but when only 1 object is appended to a sorted list it will iterate the list no more than 2 time 
		this.hasChanged();
		this.notifyObservers();
		this.clearChanged();
	}
	
	public void remove(){
		persons.remove(persons.size()-1);
		this.hasChanged();
		this.notifyObservers();
		this.clearChanged();
	}
}
