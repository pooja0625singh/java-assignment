class Student {
    private String studentName;
    private int studentRollNo;
    private String studentBranch;
    private double studentPercentage;

    // Getter and Setter methods
    public String getStudentName(){
        return this.studentName;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }

    public int getStudentRollNo(){
        return this.studentRollNo;
    }
    public void setStudentRollNo(int rollNo){
        this.studentRollNo = rollNo;
    }

    public String getStudentBranch(){
        return this.studentBranch;
    }
    public void setStudentBranch(String branch){
        this.studentBranch = branch;
    }

    public double getStudentPercentage(){
        return this.studentPercentage;
    }
    public void setStudentPercentage(double percentage){
        this.studentPercentage = percentage;
    }
}

public class Question2_coreJava{
    public static void main(String args[]){
        Student student=new Student();
        student.setStudentName("Pooja Singh");
        student.setStudentRollNo(6);
        student.setStudentBranch("Science");
        student.setStudentPercentage(82.2);
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student RollNo: " + student.getStudentRollNo());
        System.out.println("Student Branch: " + student.getStudentBranch());
        System.out.println("Student Percentage: " + student.getStudentPercentage() + "%");

    }
}