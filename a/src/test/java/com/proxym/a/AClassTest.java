package com.proxym.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AClassTest {

    @Test
    public void sum() {
        AClass a = new AClass();
        Integer result = a.sum(1, 3);

        assertEquals(result, 4);
    }

}