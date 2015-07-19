package Java_Thread2_practice;

public class TestThread {

	public static void main(String[] args) {
		SimpleThread simpleThread = new SimpleThread();
		simpleThread.start();
		
		for (int i = 0; i < 10; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+i);
		}
	}
}

class SimpleThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+i);
		}
	}
}
