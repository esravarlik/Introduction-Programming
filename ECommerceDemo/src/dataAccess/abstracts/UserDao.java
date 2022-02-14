package dataAccess.abstracts;
import entities.concretes.User;
import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);

    User get(String firstName);
    List<User> getAll();
}
