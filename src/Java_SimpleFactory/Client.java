package Java_SimpleFactory;

public class Client {

	/**
	 * @param args
	 * 简单工厂模式的实现
	 * 简单工厂模式是类的创建模式，又叫静态工厂方法模式。简单工厂模式是由一个工厂对象决定创建出那一种产品类的实例。通常它根据自变量的不同返回不同的类的实例
	 * 构成：
	 * 1)工厂类(Creator)角色：担任这个角色的实简单工厂模式的核心，含有与应用紧密相关的商业逻辑。工厂类在客户端的直接调用下创建产品对象，它往往由一个具体类实现
	 * 2)抽象产品(Product)角色：担任这个角色的类是简单工厂模式所创建的对象的父类，或它们共同拥有的接口。抽象产品角色可以用一个接口或者抽象类实现
	 * 3)具体产品(Concrete Product)角色：简单工厂模式所创建的任何对象都是这个角色的实例，具体产品角色由一个具体类实现
	 */
	public static void main(String[] args) {
		Product productA = Creator.createProduct("A");
		System.out.println(productA.getClass().getSimpleName());
		Product productB = Creator.createProduct("B");
		System.out.println(productB.getClass().getSimpleName());
	}

}
