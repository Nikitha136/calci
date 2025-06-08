package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testSubtraction {

    @Test
    void test() {
        MySimpleCalci c = new MySimpleCalci();
        int result = c.subtraction(11, 13);
        assertEquals(-2, result);
    }
}
