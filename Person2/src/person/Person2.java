package person;

public class Person2 
{
	int age = 20;
	String name = "ȫ�浿";
	String addr = "�����";
	boolean isMan = true;

	public void printAge(int paramAge) {
		age = paramAge;
		System.out.println("���� : " + age);
	}
	
	public void printName(String paramName) {
		name = paramName;
		System.out.println("�̸� : " + name);
	}
	
	public void printAddr(String paramAddr) {
		addr = paramAddr;
		System.out.println("�ּ� : " + addr);
	}
	
	public void printIsMan(boolean paramIsMan) {
		isMan = paramIsMan;
		if (isMan == true) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}
