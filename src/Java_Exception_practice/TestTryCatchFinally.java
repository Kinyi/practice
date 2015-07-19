package Java_Exception_practice;

public class TestTryCatchFinally {

	public static void main(String[] args) {
		try {
			int i = 10;
			int j = i /0;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		} catch (Exception e){
			System.out.println(e.getMessage());
		} finally{
			System.out.println("finally...");
		}
		
		System.out.println("end...");
	}

}
