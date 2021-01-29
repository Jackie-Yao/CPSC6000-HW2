package HW2_Factory;

public class CakeStore {
	SimpleCakeFactory factory;
	
	public CakeStore(SimpleCakeFactory factory) {
		this.factory = factory;
	}
	
	public Cake orderCake(String type) {
		Cake cake;
		cake = factory.createCake(type);
		return cake;
	}
}
