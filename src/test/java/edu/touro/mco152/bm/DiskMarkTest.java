package edu.touro.mco152.bm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DiskMarkTest {
    DiskMark dm = new DiskMark(DiskMark.MarkType.READ);

    /**
     * Parameterized test that sets ints that are passed in as mark num and checks using the innate get method
     *
     * @param num
     */
    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8})
     void testSetMarkNum(int num) {
        dm.setMarkNum(num);
        assertEquals(dm.getMarkNum(), num);
    }
}