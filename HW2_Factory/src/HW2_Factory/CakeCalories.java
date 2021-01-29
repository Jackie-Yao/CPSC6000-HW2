package HW2_Factory;

public class CakeCalories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calculate Calories for Chocolate Cake with Whipped Cream
		Cake cake1 = new ChocolateBaseLayer();
		cake1 = new WhippedCream(cake1);
	
		System.out.println("Cake of Choice: " + cake1.getDescription());
		System.out.println("Calories of this Cake: " + cake1.Calories());
		
		// Calculate Calories for Vanilla Cake with Strawberry
		Cake cake2 = new VanillaBaseLayer();
		cake2 = new StrawberryTopping(cake2);
	
		System.out.println("Cake of Choice: " + cake2.getDescription());
		System.out.println("Calories of this Cake: " + cake2.Calories());	
			
	}

}
