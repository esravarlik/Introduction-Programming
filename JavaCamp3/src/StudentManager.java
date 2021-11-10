public class StudentManager extends UserManager {
    @Override
    public void add(User user){
        System.out.println("Student:" + user.getFullName()+" added.");
    }
}
