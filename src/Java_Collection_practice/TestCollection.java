package Java_Collection_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestCollection{

	public static void main(String[] args) {
		
		//1. ����һ�� Collection �ӿڵĶ���. 
		Collection collection = new ArrayList();
	
		//2. Collection ��Ҫ����˵��: 
		
		/**
		 * 2.1 �������Ԫ�ص�:
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
		 * 2.2 ���ڷ��ʼ��ϵķ���: 
		 * ��ȡ���ϵĳ��ȣ� size()
		 * �Լ��Ͻ��б����ķ���: iterator() ���Եõ���Ӧ�� Iterator �ӿڶ���. 
		 * 
		 * Iterator: ������
		 * ��. ��ȡ Iterator �ӿڶ���: 
		 * ��. ʹ�� while ѭ���� Iterator ������������е�ÿһ��Ԫ��. ����ʹ�� Iterator �ӿڵ�
		 *    hasNext() �� next() ����. 
		 */
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj); 
		}
	}
}		
		/**
		 * 2.3 �Ƴ������е�Ԫ��: 
		 * remove(): �Ƴ�ĳһ��ָ���Ķ���. ͨ�� equals() �������ж�Ҫ�Ƴ����Ǹ�Ԫ���ڼ������Ƿ����. �Լ��Ƿ��ܹ��ɹ��Ƴ�. 
		 * removeAll()
		 * clear(): ʹ�����е�Ԫ���ÿ�. 
		 */