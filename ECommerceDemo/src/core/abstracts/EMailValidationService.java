package core.abstracts;


import entities.concretes.User;

public interface EMailValidationService {
    boolean  ifEmailFormatCheckValid(User email);

}
