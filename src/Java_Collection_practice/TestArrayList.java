package Java_Collection_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Person("aa", 12));
		list.add(new Person("bb", 13));
		list.add(new Person("cc", 14));
		list.add(new Person("dd", 15));
		
		System.out.println(list.size());;
		//使用迭代器进行遍历
		/*Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//使用增强型for循环进行遍历
		/*for (Object obj : list) {
			System.out.println(obj);
		}*/
		
		//使用一般for循环进行遍历
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		//使用ListIterator进行遍历
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
	}

}
