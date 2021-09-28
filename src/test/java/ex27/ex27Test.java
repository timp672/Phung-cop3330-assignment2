package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex27Test {

    @Test
    void validateFirst() {
        assertEquals(true,ex27.validateFirst("John"));
    }

    @Test
    void validateLast() {
        assertEquals(true,ex27.validateLast("Johnson"));
    }

    @Test
    void validateZip() {
        assertEquals(true,ex27.validateFirst("55555"));
    }

    @Test
    void validateID() {
        assertEquals(true,ex27.validateFirst("TK-4321"));
    }
}