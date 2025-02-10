public class Program {
    private String studentCourseProgram = "";

    public Program(String studentCourseProgram){

        this.studentCourseProgram = studentCourseProgram;
    }
    public void setStudentCourseProgram(String studentCourseProgram){
        this.studentCourseProgram = studentCourseProgram;
    }
    public String getStudentCourseProgram(){
        return studentCourseProgram;
    }

    public void displayCourseInfo(){
        System.out.println("Course: " + getStudentCourseProgram());
    }
}
