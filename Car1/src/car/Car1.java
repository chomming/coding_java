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
		System.out.println("������ : " + maker);
	}
	
	public void printMakeYear() {
		System.out.println("�����⵵ : " + makeYear);
	}
	
	public void printWheelSize() {
		System.out.println("�� ũ�� : " + wheelSize + "��ġ");
	}
	
	public void printLight() {
		if (light == true) {
			System.out.println("����Ʈ OFF");
		}
		else {
			System.out.println("����Ʈ ON");
		}
	}
}
