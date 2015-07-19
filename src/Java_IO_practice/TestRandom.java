package Java_IO_practice;

import java.util.Random;
import static java.lang.Math.*;
import org.junit.Test;

public class TestRandom {

	@Test
	public void testMath(){   
		System.out.println(sin(PI/2));
	}
	
	@Test
	public void testRandom() {
		Random random = new Random();
		
//		System.out.println(random.nextInt());  
		System.out.println(random.nextInt(10));
		System.out.println(Math.round(((double)Math.random()*100)));
	}

}
