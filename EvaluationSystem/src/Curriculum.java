public class Curriculum {
    private int studentYearLevel;
    private int studentSemester;
    private String studentSchoolYear = "";

    public Curriculum(int studentYearLevel, int studentSemester, String studentSchoolYear){
        this.studentYearLevel = studentYearLevel;
        this.studentSemester = studentSemester;
        this.studentSchoolYear = studentSchoolYear;
    }

    public void setStudentYearLevel(int studentYearLevel){
        this.studentYearLevel = studentYearLevel;
    }
    public int getStudentYearLevel(){
        return studentYearLevel;
    }
    public void setStudentSemester(int studentSemester){
        this.studentSemester = studentSemester;
    }
    public int getStudentSemester(){
        return studentSemester;
    }
    public void setStudentSchoolYear(String studentSchoolYear){
        this.studentSchoolYear = studentSchoolYear;
    }
    public String getStudentSchoolYear(){
        return studentSchoolYear;
    }

    public void displayStudentCurriculum(){
        System.out.println("Year level: " + getStudentYearLevel());
        System.out.println("Semester: " + getStudentSemester());
        System.out.println("School year: " + getStudentSchoolYear());
    }
}
