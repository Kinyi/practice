package Java_Collection_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGeneric{
	
	/**
	 * 打印 Person 信息
	 */
	public static void printPersonInfo(List<? extends Person> persons){
		
		
		persons.add(null);
		
		//persons 中元素的类型是 Person 类型或 Person 子类的某一个类型, 但不能确定是哪个类型
		//所以放入任何类型都会导致安全的问题. 
//		persons.add(new Person("", 11));
		
		for(Person person: persons){ 
			System.out.println(person);
		}
	}
	
	public static <T> T get(Integer id){
		T result = null;
		
		return result;
	}
	
	/**
	 * 泛型方法: 在方法声明时, 同时声明泛型. 在方法的返回值, 参数列表以及方法体中都可以使用泛型类型. 
	 * 把指定类型的数组中的元素放入到指定类型的集合中
	 */
	public static <T> void fromArrayToCollection(T [] objs, Collection<T> coll){
		
	}
	
	public static void main(String[] args) {
		
		String[] objs2 = new String[]{"AA", "BB", "CC"};
		Collection<String> coll2 = new ArrayList<String>();
		
		fromArrayToCollection(objs2, coll2);
		
		Person[] objs3 = new Person[]{new Person("AA", 12)};
		Collection<Person> coll3 = new ArrayList<Person>();
		
		fromArrayToCollection(objs3, coll3);
		
		List<Student> stus = new ArrayList<Student>();
		stus.add(new Student("BB", 22, "ATGUIGU"));
		printPersonInfo(stus);
		
		List<Person> persons2 = new ArrayList<Person>();
		persons2.add(new Person("AA", 12));
		printPersonInfo(persons2);
		
		System.out.println(); 
		
		//String 为 Object 类型的子类, 则 String[] 也是 Object[] 的子类
		Object [] objs = new String[]{"AA", "BB"};
		
		//String 为 Object 类型的子类, 则 List<String> 不是 List<Object> 的子类!
//		List<String> strList = new ArrayList<String>();
//		List<Object> objList = strList;
		
		
		
		DAO<Person> dao = new DAO<Person>();
		Person person2 = dao.get(10);
		
		dao.save(new Person());
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("AA", 12));
		persons.add(new Person("BB", 13));
		persons.add(new Person("CC", 14));
		persons.add(new Person("DD", 15));
		
//		persons.add("person");
		
		for(int i = 0; i < persons.size(); i++){
			Person person = persons.get(i);
			System.out.println(person); 
		}
		
//		Person [] personArray = (Person[]) persons.toArray();
//		System.out.println(personArray.length); 
		
		Person [] personArray = persons.toArray(new Person[0]);
		System.out.println(personArray.length); 
		
		Map<String, Person> personMap = new HashMap<String, Person>();

		personMap.put("AA", persons.get(0));
		personMap.put("BB", persons.get(1));
		personMap.put("CC", persons.get(2));
		personMap.put("DD", persons.get(3));
		
		for(Map.Entry<String, Person> entry: personMap.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue()); 
		}
		/*
		List persons = new ArrayList();
		
		persons.add(new Person("AA", 12));
		persons.add(new Person("BB", 13));
		persons.add(new Person("CC", 14));
		persons.add(new Person("DD", 15));
		persons.add("person");
		
//		Object obj = persons.get(0);
		
		for(int i = 0; i < persons.size(); i++){
			//类型的强制转换
			Person person = (Person) persons.get(i);
			System.out.println(person);
		}
		*/
	}

}