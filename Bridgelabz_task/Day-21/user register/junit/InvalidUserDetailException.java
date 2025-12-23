package junit;


public class InvalidUserDetailException extends Exception {
    public InvalidUserDetailException(String message) {
        super(message);
    }
}


public class InvalidFirstNameException extends InvalidUserDetailException {
    public InvalidFirstNameException(String message) {
        super(message);
    }
}

class InvalidLastNameException extends InvalidUserDetailException {
    public InvalidLastNameException(String message) {
        super(message);
    }
}

class InvalidEmailException extends InvalidUserDetailException {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidMobileException extends InvalidUserDetailException {
    public InvalidMobileException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends InvalidUserDetailException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
