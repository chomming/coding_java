package student;

public class Student1Main 
{
	public static void main (String [] args) 
	{
		Student1 s1 = new Student1();
		s1.setNo("2020");
		s1.setName("ȫ�浿");
		s1.setKorScore(85);
		s1.setEngScore(70);
		s1.setMathScore(90);
		
		s1.printNo();
		s1.printName();
		s1.printKorScore();
		s1.printEngScore();
		s1.printMathScore();
		s1.printSummary();
		s1.printAverage();
	}
}
