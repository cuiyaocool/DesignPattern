package FactoryPattern;

public class FactorPatternDemo {

	public static void main(String[] args) {
		ProductFactory productFactory = new ProductFactory();
		System.out.println("need productOne: ");
		productFactory.getProduct("productOne");
		System.out.println("need productTwo: ");
		productFactory.getProduct("productTwo");
	}
}
