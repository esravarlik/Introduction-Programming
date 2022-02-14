package dataAccess.concretes;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("Hibernate User added: " +
                user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernate User updated: " +
                user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernate User deleted: " +
                user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public User get(String firstName) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
