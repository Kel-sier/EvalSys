public class Student {
    private String studentName = "";
    private int studentID;
    private String studentBday;
    private String studentAddress = "";
    private String stud;

    public Student(String studentName, int studentID, String studentBday, String studentAddress, String stud){

        this.studentName = studentName;
        this.studentID = studentID;
        this.studentBday = studentBday;
        this.studentAddress = studentAddress;
        this.stud = stud;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentBday(String studentBday){
        this.studentBday = studentBday;
    }

    public String getStudentBday(){
        return studentBday;
    }

    public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
    }

    public String getStudentAddress(){
        return studentAddress;
    }

    public void setStud(String stud){
        this.stud = stud;
    }

    public String getStud(){
        return stud;
    }

    public void displayStudentInfo(){
        System.out.println("---Student Info---");
        System.out.println("Name: " + getStudentName());
        System.out.println("ID: " + getStudentID());
        System.out.println("Birthday: " + getStudentBday());
        System.out.println("Address: " + getStudentAddress());
    }
}
