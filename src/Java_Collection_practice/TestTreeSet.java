package Java_Collection_practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set set = new TreeSet();
		// set.add(null);
		// set.add(new Person());
		// set.add("abc");
		// set.add("efg");
		set.add(new Student("aa", 97));
		set.add(new Student("bb", 94));
		set.add(new Student("cc", 95));
		set.add(new Student("dd", 98));

		System.out.println(set.size());
		
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					Person p1 = (Person) o1;
					Person p2 = (Person) o2;
					return -p1.getAge() + p2.getAge();
					
				}else{
					throw new ClassCastException("不能转为 Person");
				}
			}
		};
		
		Set set2 = new TreeSet(comparator);
		set2.add(new Person("AA", 12));
		set2.add(new Person("BB", 11));
		set2.add(new Person("CC", 16));
		set2.add(new Person("DD", 15));
		
		for(Object obj: set2){
			System.out.println(obj); 
		}
	}

}
