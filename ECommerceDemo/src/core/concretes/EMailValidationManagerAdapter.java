package core.concretes;

import core.abstracts.EMailValidationService;
import entities.concretes.User;

import java.util.regex.Pattern;

public class EMailValidationManagerAdapter implements EMailValidationService {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean ifEmailFormatCheckValid(User email) {
        return VALID_EMAIL_ADDRESS_REGEX.matcher(email.geteMail()).find();
    }
}
