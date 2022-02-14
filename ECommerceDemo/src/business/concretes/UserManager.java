package business.concretes;
import business.abstracts.UserService;
import core.concretes.EMailValidationManagerAdapter;
import core.concretes.GoogleAccountManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private GoogleAccountManager googleAccountManager;
    EMailValidationManagerAdapter eMailValidationManagerAdapter;


    public UserManager(UserDao userDao,EMailValidationManagerAdapter eMailValidationManagerAdapter) {
        super();
        this.userDao = userDao;
        this.eMailValidationManagerAdapter = eMailValidationManagerAdapter;
    }

    public UserManager(GoogleAccountManager googleAccountManager){
        super();
        this.googleAccountManager = googleAccountManager;
    }

    private boolean isValidFirstName(User user){
        if(user.getFirstName().length() >= 2){
            return true;
        }
        System.out.println("First name must starts with minimum 2 characters.");
        return false;
    }

    private boolean isValidLastName(User user){
        if(user.getLastName().length() >= 2){
            return true;
        }
        System.out.println("Last name must starts with minimum 2 characters.");
        return false;
    }

    private boolean isValidPassword(User user){
        if(user.getPassword().length() >= 6){
            return true;
        }
        System.out.println("Password must be at least 6 characters.");
        return false;
    }

    private boolean isValidEmail(User user){
        if(this.eMailValidationManagerAdapter.ifEmailFormatCheckValid(user)){
            return true;
        }
        System.out.println("İnvalid email");
        return false;
    }

    @Override
    public void add(User user) {
        if(isValidFirstName(user) && isValidLastName(user) &&
                isValidPassword(user) && isValidEmail(user)){
            this.userDao.add(user);
            System.out.println("Login successful!");
        }else{
        System.out.println("User registration failed!");}
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
