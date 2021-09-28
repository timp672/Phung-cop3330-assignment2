package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex38Test {

    @Test
    void filterList() {
        String input ="1 2 3 4 5 6 7 8";
        String[] list = input.split(" ");

        Integer[] expected = ex38.filterList(list);
        assertArrayEquals(expected,ex38.filterList(list));
    }
}