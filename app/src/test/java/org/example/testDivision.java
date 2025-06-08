package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testDivision {

    @Test
    public void test() {
        MySimpleCalci c = new MySimpleCalci();
        assertEquals(3.142856f, c.division(22, 7), 0.000002f);
    }
}
