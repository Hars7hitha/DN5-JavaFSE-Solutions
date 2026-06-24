package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AAATest {

    @Test
    void testAddition() {

        // Arrange
        Calculator c = new Calculator();

        // Act
        int result = c.add(10, 20);

        // Assert
        assertEquals(30, result);
    }
}