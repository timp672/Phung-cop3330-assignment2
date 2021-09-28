package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31Test {

    @Test
    void isNumber() {
        assertEquals(true, ex31.isNumber("65"));
        assertEquals(false, ex31.isNumber("abcd"));
    }
}