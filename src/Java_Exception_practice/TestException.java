package Java_Exception_practice;

public class TestException {

	public static void main(String[] args) {
		int i = 10;
		//��ѧ�쳣��java.lang.ArithmeticException
		//int j=i/0;
		//System.out.println(j);
		
		int [] scores = new int[]{1,2,4,5};
		//�����±�Խ���쳣��java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(scores[4]);
		
		Person p1 = new Man();
		//����ת���쳣��java.lang.ClassCastException
		//Woman p2 = (Woman)p1;
		
		p1 = null;
		//��ָ���쳣��java.lang.NullPointerException
		//System.out.println(p1.toString());
		
		System.out.println("end...");
	}

}

class Person{
	
}

class Man extends Person{
	
}

class Woman extends Person{
	
}