package Assignment3;

class Student {

	private int rollNo;
	int admissionNo;
	public int age;
	protected int courseId;
	
	private void setRollNo() {rollNo=101;}
	void setAddmissionNo(int y) {admissionNo=y;}
	public void age(int z) {age=z;}
	protected void setCourseId(int a) {courseId=a;}
	
	
}

public class StudentData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Student s=new Student();
			
			s.age(25);
			s.setCourseId(12112);
			///unable to access as it is a private menber and it is limited to same class
			
			

	}

}
