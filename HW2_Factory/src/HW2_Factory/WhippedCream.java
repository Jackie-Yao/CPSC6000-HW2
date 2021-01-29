package HW2_Factory;

public class WhippedCream extends CakeDecorator {
	
	Cake cake;
	
	public WhippedCream(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription() + ", Whipped Cream";
	}

	@Override
	public double Calories() {
		// TODO Auto-generated method stub
		return cake.Calories() + 300;
	}

}
