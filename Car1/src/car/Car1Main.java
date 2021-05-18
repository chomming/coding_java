package car;

public class Car1Main 
{
	public static void main(String [] args) 
	{
		Car1 c1 = new Car1();
		c1.setMaker("현대/기아");
		c1.setMakeYear(2010);
		c1.setWheelSize(20);
		
		c1.printMaker();
		c1.printMakeYear();
		c1.printWheelSize();
		c1.printLight();
	}
}
