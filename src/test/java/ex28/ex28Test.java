package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex28Test {
    @Test
    void calculateTotal() {
        int input = 0;
        int actual = 0;
        for (int i = 0; i<5; i++)
        {
            input = i +1;
            actual += ex28.calculateTotal(input);
        }
        assertEquals(15,actual);
    }
}