package HW2_Factory;

public class SimpleCakeFactory {
	public Cake createCake(String type) {
		Cake cake = null;
		
		if(type.equals("ValuePick")) {
			System.out.println("Creating: Value Pick!");
			cake = new VanillaBaseLayer();
			
		} else if (type.equals("EnergyBoost")){
			System.out.println("Creating: Energy Boost!");
			cake = new ChocolateBaseLayer();
			cake = new WhippedCream(cake);
							
		} else if (type.equals("FruityRefresh")) {
			System.out.println("Creating: Fruity Refresh!");
			cake = new VanillaBaseLayer();
			cake = new StrawberryTopping(cake);
		}
		return cake;
	}
	
}
