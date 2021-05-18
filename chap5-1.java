class Student 
{
	int age = 20;
	String name;
	
	public void printAge1() {
		int age = 10;
		System.out.println("나이 : " + age);
	}
	
	public void printAge2() {
		System.out.println("나이 : " + age);
	}
	
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.printAge1();
		st1.printAge2();
	}
}
