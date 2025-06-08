package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testAddition {

    @Test
    public void test() {
        MySimpleCalci c = new MySimpleCalci();
        int result = c.addition(11, 13);
        assertEquals(24, result);
    }
}
