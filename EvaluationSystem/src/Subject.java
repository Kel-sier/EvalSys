public class Subject {
    private int semNum;
    private String subjectCode;
    private String subjectName;
    private int units;
    public Subject(int semNum, String subjectCode, String subjectName, int units){
        this.semNum = semNum;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.units = units;
    }

    public void setSemNum(int semNum){
        this.semNum = semNum;
    }
    public int getSemNum(){
        return semNum;
    }
    public void setSubjectCode(String subjectCode){
        this.subjectCode = subjectCode;
    }
    public String getSubjectCode(){
        return subjectCode;
    }
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public void setUnits(int units){
        this.units = units;
    }
    public int getUnits(){
        return units;
    }
    public void displaySubjectInfo(){
        System.out.println("---Subject Info---");
        System.out.println("Semester: " + getSemNum());
        System.out.println("Subject Code: " + getSubjectCode());
        System.out.println("Subject Name: " + getSubjectName());
        System.out.println("Units: " + getUnits());
    }
}
