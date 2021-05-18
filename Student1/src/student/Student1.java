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
		System.out.println("학번 : " + no);
	}
	
	public void printName() {
		System.out.println("이름 : " + name);
	}
	
	public void printKorScore() {
		System.out.println("국어 성적 : " + korScore);
	}
	
	public void printEngScore() {
		System.out.println("영어 성적 : " + engScore);
	}
	
	public void printMathScore() {
		System.out.println("수학 성적 : " + mathScore);
	}
	
	public void printSummary() {
		int totalScore = korScore + engScore + mathScore;
		System.out.println("총합 : " + totalScore);
	}
	
	public void printAverage() {
		int averageScore = (korScore + engScore + mathScore)/3;
		System.out.println("평균 : " + averageScore);
	}
}
