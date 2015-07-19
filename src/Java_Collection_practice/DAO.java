package Java_Collection_practice;

/**
 * 声明类的同时, 声明泛型类型. 
 * @param <T>
 */
public class DAO<T> {

	/**
	 * 方法的返回值可以使用前面声明的泛型类型
	 * @param id
	 * @return
	 */
	public T get(Integer id){
		T result = null;
		return result;
	}
	
	/**
	 * 方法的参数也可以使用声明类时声明的泛型类型.
	 * @param entity
	 */
	public void save(T entity){
		
	}

}