package Java_Collection_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestCollection{

	public static void main(String[] args) {
		
		//1. 创建一个 Collection 接口的对象. 
		Collection collection = new ArrayList();
	
		//2. Collection 重要方法说明: 
		
		/**
		 * 2.1 用于添加元素的:
		 * add()
		 * addAll()
		 */
		Person p1 = new Person();
		collection.add(p1);
		collection.add(new Person());
		
		Collection collection2 = new ArrayList();
		collection2.add(new Person());
		collection2.add(new Person());

		collection.addAll(collection2);
		
		System.out.println(collection.size()); 
		
		/**
		 * 2.2 用于访问集合的方法: 
		 * 获取集合的长度： size()
		 * 对集合进行遍历的方法: iterator() 可以得到对应的 Iterator 接口对象. 
		 * 
		 * Iterator: 迭代器
		 * ①. 获取 Iterator 接口对象: 
		 * ②. 使用 while 循环和 Iterator 对象遍历集合中的每一个元素. 具体使用 Iterator 接口的
		 *    hasNext() 和 next() 方法. 
		 */
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj); 
		}
	}
}		
		/**
		 * 2.3 移除集合中的元素: 
		 * remove(): 移除某一个指定的对象. 通过 equals() 方法来判断要移除的那个元素在集合中是否存在. 以及是否能够成功移除. 
		 * removeAll()
		 * clear(): 使集合中的元素置空. 
		 */