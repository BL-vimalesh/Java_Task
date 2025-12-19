package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.Login_access;
import junit.VoterService;

public class user_login {

	Login_access login_access = new Login_access();
    @Test
    void age18_shouldBeEligible() {
        boolean result = login_access.user_login("vimaleshkvkl@gmail.com","VImalesh@281");
        assertTrue(result);
    }
    
    @Test
    void age18_shouldBeEligible2() {
        boolean result = login_access.user_login("vimaleshkvklgmail.com","VImalesh@281");
        assertTrue(result);
    }
}