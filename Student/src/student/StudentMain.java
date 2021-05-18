package student;

public class StudentMain {
	public static void main(String [] args)
	{
		Student st1 = new Student();
		st1.Age = "21";
		st1.No = "2021";
		st1.Address = "서울시";
		st1.Num = "010-0000-0001";
		
		Student st2 = new Student();
		st2.Age = "22";
		st2.No = "2022";
		st2.Address = "경기도";
		st2.Num = "010-0000-0002";
		
		Student st3 = new Student();
		st3.Age = "23";
		st3.No = "2023";
		st3.Address = "충청북도";
		st3.Num = "010-0000-0003";
		
		st1.printAge();
		st1.printNo();
		st1.printAddress();
		st1.printNum();
		
		st2.printAge();
		st2.printNo();
		st2.printAddress();
		st2.printNum();
		
		st3.printAge();
		st3.printNo();
		st3.printAddress();
		st3.printNum();
	}
}
