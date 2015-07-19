package test;

/*
 * 在这里，A和B都是Test_drive的内部类，类似于普通的实例变量，
 * 类的静态方法不可以直接调用类的实例变量。
 * 在这里，内部类不是静态的内部类，
 * 所以，直接赋值（即实例化内部类），所以程序报错。
 */

public class TestInnerClass {

	public static void main(String[] args){
	   // A a = new A();//报错
	   // B b = new B();//报错
	   // System.out.println(b instanceof A);
	  }
	  class A{
	    int a;
	  }
	  class B extends A{
	  }

}
