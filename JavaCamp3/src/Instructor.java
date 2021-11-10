public class Instructor extends User{
    private String courseNumbers;
    private String studentNumbers;

    public Instructor(int id,String fullName, String email, String courseNumbers, String studentNumbers){
        super(id,fullName,email);
        this.courseNumbers = courseNumbers;
        this.studentNumbers = studentNumbers;
    }

    public String getCourseNumbers() {
        return courseNumbers;
    }

    public void setCourseNumbers(String courseNumbers) {
        this.courseNumbers = courseNumbers;
    }

    public String getStudentNumbers() {
        return studentNumbers;
    }

    public void setStudentNumbers(String studentNumbers) {
        this.studentNumbers = studentNumbers;
    }
}
