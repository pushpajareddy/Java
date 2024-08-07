import java.util.*;
class R192125028 
    {
    String name;
    long registerNumber;
    int[] subjectMarks=new int[5];
	double total=0.0,average;
    Student(String name,long registerNumber,int[] subjectMarks) {
        this.name=name;
        this.registerNumber=registerNumber;
        this.subjectMarks=subjectMarks;
    }
    void calculateAverageMarks() {
        for (int i=0;i<subjectMarks.length;i++) {
		total=total+subjectMarks[i];
	}
	average=total/subjectMarks.length;
    }
    void displayStudentDetails() {
        System.out.println("Student Name:"+name);
        System.out.println("Register Number:"+registerNumber);
        System.out.println("Subject Marks:");
        for (int i=0;i<subjectMarks.length;i++) {
            System.out.println("Subject"+(i+1)+":"+subjectMarks[i]);
        }
        System.out.println("Total Marks:"+total);
        System.out.println("Average Marks:"+average);
    }
    public static void main(String[] args) {
        String name="manvi";
        long regNumber=192110106;
        int[] marks={50,60,40,20,10};
        Student st=new Student(name,regNumber,marks);
	st.calculateAverageMarks();
        st.displayStudentDetails();
    }
}

