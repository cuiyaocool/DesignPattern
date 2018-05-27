package FactoryPattern;

public class ProductFactory {
	public void getProduct(String type) {
		if ("productOne".equals(type)) {
			new ProduceOne().make();
		} else {
			new ProduceTwo().make();
		}
	}

}
