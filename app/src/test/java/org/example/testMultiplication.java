package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testMultiplication {

    @Test
    public void test() {
        MySimpleCalci c = new MySimpleCalci();
        int result = c.multiplication(11, 13);
        assertEquals(143, result);
    }
}
