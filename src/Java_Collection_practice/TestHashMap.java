package Java_Collection_practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {
		final Map map = new HashMap();
		map.put("aa", new Person("aaa", 12));
		map.put("cc", new Person("ccc", 11));
		map.put("bb", new Person("bbb", 14));
		map.put("dd", new Person("ddd", 13));
		System.out.println(map.size());

		final Set keySet = map.keySet();
		for (Object key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}

		final Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}

		final Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person) o1;
				Person p2 = (Person) o2;
				return p1.getAge() - p2.getAge();
				//return p1.getName().compareTo(p2.getName());
			}

		};

		final TreeMap tm = new TreeMap(comparator);
		tm.put(new Person("AA", 12),"AAA");
		tm.put(new Person("BB", 22),"BBB");
		tm.put(new Person("CC", 2),"CCC");
		tm.put(new Person("DD", 9),"DDD");

		final Set keySet2 = tm.keySet();
		for (Object key : keySet2) {
			final Object value = tm.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
