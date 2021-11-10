public class InstructorManager extends UserManager{
    @Override
    public void add(User user){
        System.out.println("Instructor:"+ user.getFullName()+"  added.");
    }

}
