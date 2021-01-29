package HW2_Factory;

public class StrawberryTopping extends CakeDecorator {
	
	Cake cake;
	
	public StrawberryTopping(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription() + ", Strawberry Topping";
	}

	@Override
	public double Calories() {
		// TODO Auto-generated method stub
		return cake.Calories() + 100;
	}

}
