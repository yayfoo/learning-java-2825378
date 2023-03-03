public class StudentProfile{
    String firstName;
    String lastName;
    String fullName;
    double GPA;
    int expectedGradYear;
    boolean declaredMajor;

    public StudentProfile(String firstName, String lastName, double GPA, int expectedGradYear, boolean declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
        this.GPA = GPA;
        this.expectedGradYear = expectedGradYear;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGradYearByOne(){
        System.out.println("Incrementing the expected graduation year by one for student " + this.fullName);
        this.expectedGradYear++;
    }

    public void print(){
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("GPA: " + this.GPA);
        System.out.println("Expected graduation year: " + this.expectedGradYear);
        System.out.println("Has declared major: " + this.declaredMajor);
    }
}