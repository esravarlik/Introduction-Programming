public class Student extends User{
    private String courseName;

    public Student(int id,String fullName, String email, String courseName){
        super(id,fullName,email);
        this.courseName=courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
