package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex25Test {

    @Test
    void passwordValidator() {
        assertEquals(1,ex25.passwordValidator("12345"));
        assertEquals(2,ex25.passwordValidator("abcde"));
        assertEquals(3,ex25.passwordValidator("abc123efg"));
        assertEquals(4,ex25.passwordValidator("123Abc!@#"));
    }
}