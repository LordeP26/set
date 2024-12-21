package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");    

		set.removeIf(x -> x.charAt(0) == 'T');
		// set.remove("Tablet");

		for (String p : set) {
			System.out.println(p);
		}

	}

}
