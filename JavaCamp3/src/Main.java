public class Main {

    public static void main(String[] args) {

        Student student = new Student(123,"Esra","e@gmail.com","Java&React");

        Instructor instructor = new Instructor(001,"EnginDemiroğ","e@gmail.com","4","105");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);

    }
}
