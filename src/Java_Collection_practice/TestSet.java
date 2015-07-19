package Java_Collection_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 1. Set �� Collection ���ӽӿ�
 * 2. Set �в���������ͬ��Ԫ��. �ж���ͬԪ�صı�׼��, ������������� equals() ����, ���� true
 * 3. HashSet
 * 3.1 ��������:
 * ��. ���ܱ�֤Ԫ�ص�����˳��
 * ��. HashSet �����̰߳�ȫ��
 * ��. ����Ԫ�ؿ���ʹ null
 * ��. ���� HashSet: �����������ͨ�� equals() �������� true������������� hashCode ֵҲӦ����ͬ��
 * 
 * 4. LinkedHashSet:
 * 4.1 LinkedHashSet �� HashSet ������
 * 4.2 ʹ������ά��Ԫ�صĴ�����ʹ��Ԫ�ؿ��������Բ���˳�򱣴��
 * 4.3 LinkedHashSet ��������Ԫ���ظ�
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

