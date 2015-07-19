package Java_Collection_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 1. Set 是 Collection 的子接口
 * 2. Set 中不允许存放相同的元素. 判定相同元素的标准是, 两个对象各调用 equals() 方法, 返回 true
 * 3. HashSet
 * 3.1 基本特征:
 * ①. 不能保证元素的排列顺序
 * ②. HashSet 不是线程安全的
 * ③. 集合元素可以使 null
 * ④. 对于 HashSet: 如果两个对象通过 equals() 方法返回 true，这两个对象的 hashCode 值也应该相同。
 * 
 * 4. LinkedHashSet:
 * 4.1 LinkedHashSet 是 HashSet 的子类
 * 4.2 使用链表维护元素的次序，这使得元素看起来是以插入顺序保存的
 * 4.3 LinkedHashSet 不允许集合元素重复
 *
 */
public class TestSet {

	public static void main(String[] args) {
		
		Set set = new LinkedHashSet();
				//new HashSet();
		
		set.add(null);
		System.out.println(set.size()); //1
		
		Person p1 = new Person();
		set.add(p1);
		set.add(p1);

		System.out.println(set.size()); //2
		
		set.add(new Person("AA", 12));
		set.add(new Person("AA", 12));

		System.out.println(set.size()); //3
		
		set.add(new Person("FF", 13));
//		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next()); 
		}
	}

}

