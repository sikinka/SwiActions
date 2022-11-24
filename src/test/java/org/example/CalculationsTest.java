package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

        @org.junit.jupiter.api.Test
        void add() {
            assertEquals(2, Calculations.add(1, 1));
        }

}