package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex36Test {

    ArrayList<Integer> arr = new ArrayList<>();
    @Test
    void average() {
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        assertEquals(400.0,ex36.average(arr));
    }
    @Test
    void max() {
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        assertEquals(100,ex36.min(arr));
    }
    @Test
    void min() {
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        assertEquals(1000,ex36.max(arr));
    }
    @Test
    void standD() {
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        assertEquals(353.5533905932738,ex36.standD(arr));
    }
}
