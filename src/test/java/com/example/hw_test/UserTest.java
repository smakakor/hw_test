package com.example.hw_test;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = new User("am.sh@mail.ru","amir");
    User user1 = new User();
    User user2 = new User("io.oi@mail.ru","io");


    @Test
    public void isUserWithParametersCreatedCorrectly() {
        assertEquals("amir", user.getLoginUser());
        assertEquals("am.sh@mail.ru",user.getEmailUser());
    }

    @Test
    public void isUserWithoutParametersCreatedCorrectly() {
        assertNull(user1.getEmailUser());
        assertNull(user1.getLoginUser());
    }

    @Test
    public void isEmailCorrect() {
        if (!user2.getEmailUser().contains("@") || !user2.getEmailUser().contains(".")) {
            fail();
        }
    }
    @Test
    public void areEmailAndLoginEqual() {
        assertNotEquals(user2.getEmailUser(),user2.getLoginUser());
    }

}