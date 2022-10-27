package com.proxym.b;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BClassTest {

    @Test
    public void sum() {
        BClass a = new BClass();
        Integer result = a.sum(1, 3);

        assertEquals(result, 4);
    }

}