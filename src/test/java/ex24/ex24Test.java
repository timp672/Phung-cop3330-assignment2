package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24Test {
    @Test
    void isAnagram() {
        assertEquals(true, ex24.isAnagram("note","tone"));
    }

}