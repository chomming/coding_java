package person;

public class Person1 {

	int age = 20;
	String name = "ȫ�浿";
	String addr = "�����";
	boolean isMan = true;
	
	public void printAge(){
		System.out.println("���� : " + age);
	}
	
	public void printName(){
		System.out.println("�̸� : " + name);
	}
	
	public void printAddr(){
		System.out.println("�ּ� : " + addr);
	}
	
	public void printIsMan(){
		if (isMan == true) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}
