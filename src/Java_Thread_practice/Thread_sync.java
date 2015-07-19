package Java_Thread_practice;

public class Thread_sync implements Runnable{

	int num = 10;
	
	public static void main(String[] args) {
		final Thread_sync t = new Thread_sync();
		Thread tA=new Thread(t);
		Thread tB=new Thread(t);
		Thread tC=new Thread(t);
		Thread tD=new Thread(t);
		tA.start();
		tB.start();
		tC.start();
		tD.start();
	}

	@Override
	public void run() {
		while(true){
			synchronized ("") {
				if (num>0) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Ê£ÓàÆ±ÊıÎª£º"+ --num);
				}
			}
		}
	}
}
