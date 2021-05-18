package car;

public class Car1 
{
	String maker;
	int makeYear;
	int wheelSize;
	boolean light;
	
	public void setMaker(String paramMaker) {
		maker = paramMaker;		
	}
	
	public void setMakeYear(int paramMakeYear) {
		makeYear = paramMakeYear;
	}
	
	public void setWheelSize(int paramWheelSize) {
		wheelSize = paramWheelSize;
	}
	
	public void setLight(boolean paramLight) {
		light = paramLight;
	}
	
	public void printMaker() {
		System.out.println("제조사 : " + maker);
	}
	
	public void printMakeYear() {
		System.out.println("제조년도 : " + makeYear);
	}
	
	public void printWheelSize() {
		System.out.println("휠 크기 : " + wheelSize + "인치");
	}
	
	public void printLight() {
		if (light == true) {
			System.out.println("라이트 OFF");
		}
		else {
			System.out.println("라이트 ON");
		}
	}
}
