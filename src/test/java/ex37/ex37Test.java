package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex37Test {

    @Test
    void createPass() {
        String expected = ex37.createPass(8,2,2);
        assertEquals(expected, expected);
    }
}