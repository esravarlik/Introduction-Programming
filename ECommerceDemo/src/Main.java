import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EMailValidationManagerAdapter;
import core.concretes.GoogleAccountManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

import java.lang.String;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new HibernateUserDao(),new EMailValidationManagerAdapter());
        User user = new User("esra","varlik","esra@gmail.com","365894562");
        userService.add(user);
        System.out.println("------------------------------");
        User user1 = new User("engin", "demirog", "engigmail.com", "35468trg");
        userService.add(user1);
        System.out.println("------------------------------");
        User user2 = new User("e", "demirog", "engin@gmail.com", "35468trg");
        userService.add(user2);
        System.out.println("------------------------------");
        User user3 = new User("engin", "demirog", "engin@gmail.com", "35468");
        userService.add(user3);
        System.out.println("------------------------------");
        User user4 = new User("engin", "d", "engin@gmail.com", "35468trg");
        userService.add(user4);
        System.out.println("------------------------------");
        UserService userService1 = new UserManager(new GoogleAccountManager("engin@gmail.com"));

    }
}
