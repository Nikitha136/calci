package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testRemainder {

    @Test
    public void test() {
        MySimpleCalci c = new MySimpleCalci();
        int result = c.remainder(13, 11);
        assertEquals(2, result);
    }
}
