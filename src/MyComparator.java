import java.util.Comparator;


public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// example for a comparing method 
		int value = p1.getHeight()-p2.getHeight();
		if (value==0)
			return 0;
		if (value<0)
			return -1;
		return 1;
	}

}
