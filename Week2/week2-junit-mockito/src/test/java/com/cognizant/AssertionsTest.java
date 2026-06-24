package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void testAssertions() {

        assertEquals(10, 5 + 5);

        assertTrue(10 > 5);

        assertFalse(5 > 10);

        assertNull(null);

        assertNotNull("Harshitha");
    }
}