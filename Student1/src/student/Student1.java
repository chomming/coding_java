package student;

public class Student1 {
	String no;
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	public void setNo(String paramNo) {
		no = paramNo;
	}
	
	public void setName(String paramName) {
		name = paramName;
	}
	
	public void setKorScore(int paramKorScore) {
		korScore = paramKorScore;
	}
	
	public void setEngScore(int paramEngScore) {
		engScore = paramEngScore;
	}
	
	public void setMathScore(int paramMathScore) {
		mathScore = paramMathScore;
	}
	
	public void printNo() {
		System.out.println("�й� : " + no);
	}
	
	public void printName() {
		System.out.println("�̸� : " + name);
	}
	
	public void printKorScore() {
		System.out.println("���� ���� : " + korScore);
	}
	
	public void printEngScore() {
		System.out.println("���� ���� : " + engScore);
	}
	
	public void printMathScore() {
		System.out.println("���� ���� : " + mathScore);
	}
	
	public void printSummary() {
		int totalScore = korScore + engScore + mathScore;
		System.out.println("���� : " + totalScore);
	}
	
	public void printAverage() {
		int averageScore = (korScore + engScore + mathScore)/3;
		System.out.println("��� : " + averageScore);
	}
}
