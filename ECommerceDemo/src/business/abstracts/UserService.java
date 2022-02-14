package business.abstracts;
import entities.concretes.User;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}
