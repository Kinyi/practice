package Java_Collection_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Person("aa", 12));
		list.add(new Person("bb", 11));
		list.add(new Person("cc", 14));
		list.add(new Person("dd", 9));
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person) o1;
				Person p2 = (Person) o2;
				return p1.getAge()-p2.getAge();
			}
		});
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		//获取线程安全的 List 对象, 使用 synchronizedList()
		List list2 = Collections.synchronizedList(new ArrayList());
				
		//对 Enumeration 对象进行遍历: hasMoreElements() nextElement()
		Enumeration names = Collections.enumeration(list);
				
		while(names.hasMoreElements()){
			Object obj = names.nextElement();
			System.out.println(obj); 
		}
		
	}
}
