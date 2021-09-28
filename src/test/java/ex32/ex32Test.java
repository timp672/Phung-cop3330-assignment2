package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex32Test {

    @Test
    void isNumeric() {
        assertEquals(true,ex32.isNumeric("123"));
        assertEquals(false,ex32.isNumeric("abc"));
    }
}