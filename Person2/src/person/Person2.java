package person;

public class Person2 
{
	int age = 20;
	String name = "홍길동";
	String addr = "서울시";
	boolean isMan = true;

	public void printAge(int paramAge) {
		age = paramAge;
		System.out.println("나이 : " + age);
	}
	
	public void printName(String paramName) {
		name = paramName;
		System.out.println("이름 : " + name);
	}
	
	public void printAddr(String paramAddr) {
		addr = paramAddr;
		System.out.println("주소 : " + addr);
	}
	
	public void printIsMan(boolean paramIsMan) {
		isMan = paramIsMan;
		if (isMan == true) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
	}
}
