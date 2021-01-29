package HW2_Factory;

public abstract class Cake {
	String description = "unknown Cake";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double Calories();

}
