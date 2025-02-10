public class School {
    private int schoolChoice;
    private String schoolName;
    private String schoolAddress = "";

    public School(int schoolChoice, String schoolName, String schoolAddress){

        this.schoolChoice = schoolChoice;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    public void setSchoolChoice(int schoolChoice){
        this.schoolChoice = schoolChoice;
    }

    public int getSchoolChoice(){
        return schoolChoice;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolAddress(String schoolAddress){
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolAddress(){
        return schoolAddress;
    }

    public void displaySchoolInfo(){
        System.out.println("---School Info---");
        System.out.println("School: " + getSchoolName());
        System.out.println("School Address: " + getSchoolAddress());
    }
}
