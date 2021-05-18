package person;

public class Person1 {

	int age = 20;
	String name = "홍길동";
	String addr = "서울시";
	boolean isMan = true;
	
	public void printAge(){
		System.out.println("나이 : " + age);
	}
	
	public void printName(){
		System.out.println("이름 : " + name);
	}
	
	public void printAddr(){
		System.out.println("주소 : " + addr);
	}
	
	public void printIsMan(){
		if (isMan == true) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
	}
}
