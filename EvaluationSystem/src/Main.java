import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String studentName = "";
        int studentID;
        String studentBday;
        String studentAddress = "";
        int schoolChoice = 0;
        String schoolName = "";
        String schoolAddress = "";
        String studentCourseProgram = "";
        int studentYearLevel = 0;
        int studentSemester = 0;
        String studentSchoolYear = "";
        boolean run = false;

        while (!run) {
            System.out.println("Hi welcome!");
            System.out.println("Please input your information");

            System.out.print("Name: ");
            studentName = sc.nextLine();

            System.out.print("ID: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid ID, please enter a valid number.");
                sc.next();
            }
            studentID = sc.nextInt();
            sc.nextLine();

            System.out.print("Birthday: ");
            studentBday = sc.nextLine();

            System.out.print("Address: ");
            studentAddress = sc.nextLine();

            Student student = new Student(studentName, studentID, studentBday, studentAddress);

            boolean validSchoolChoice = false;
            while (!validSchoolChoice) {
                System.out.println("Please pick your School");
                System.out.println("1) University of Cebu Banilad Campus\n2) University of Cebu Main Campus\n3) University of Cebu Lapu Lapu and Mandaue");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid choice. Please enter a valid number.");
                    sc.next();
                }
                schoolChoice = sc.nextInt();
                sc.nextLine();

                switch (schoolChoice) {
                    case 1:
                        schoolName = "University of Cebu Banilad Campus";
                        schoolAddress = "6000 Gov. M. Cuenco Ave, Cebu City, 6000 Cebu";
                        validSchoolChoice = true;
                        break;
                    case 2:
                        schoolName = "University of Cebu Main Campus";
                        schoolAddress = "Sanciangko St, Cebu City, 6000 Cebu";
                        validSchoolChoice = true;
                        break;
                    case 3:
                        schoolName = "University of Cebu Lapu Lapu and Mandaue";
                        schoolAddress = "A. C. Cortes Ave, Mandaue City, 6014 Cebu";
                        validSchoolChoice = true;
                        break;
                    default:
                        System.out.println("Invalid Choice. Please try again.");
                }
            }

            School school = new School(schoolChoice, schoolName, schoolAddress);

            System.out.print("Program: ");
            studentCourseProgram = sc.nextLine();
            Program program = new Program(studentCourseProgram);

            System.out.print("Year Level: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid Year Level. Please enter a valid number.");
                sc.next();
            }
            studentYearLevel = sc.nextInt();

            System.out.print("Semester: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid Semester. Please enter a valid number.");
                sc.next();
            }
            studentSemester = sc.nextInt();
            sc.nextLine();

            System.out.print("School Year: ");
            studentSchoolYear = sc.nextLine();

            Curriculum curriculum = new Curriculum(studentYearLevel, studentSemester, studentSchoolYear);

            student.displayStudentInfo();
            program.displayCourseInfo();
            curriculum.displayStudentCurriculum();
            school.displaySchoolInfo();

            System.out.println("\nDo you want to enter the information again? (yes/no)");
            String userChoice = sc.nextLine().toLowerCase();
            if (userChoice.equals("no")) {
                run = true;
            }
        }
    }
}
