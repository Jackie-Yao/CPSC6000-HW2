package HW2_Factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCakeFactory factory = new SimpleCakeFactory();
		CakeStore cakestore = new CakeStore(factory);
		
		Cake cake1 = cakestore.orderCake("FruityRefresh");
		System.out.println("Cake of Choice: " + cake1.getDescription());

		Cake cake2 = cakestore.orderCake("EnergyBoost");
		System.out.println("Cake of Choice: " + cake2.getDescription());
		
		Cake cake3 = cakestore.orderCake("ValuePick");
		System.out.println("Cake of Choice: " + cake3.getDescription());	
	}
}
