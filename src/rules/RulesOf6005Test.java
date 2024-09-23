/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
   
    /**
     * Tests the mayUseCodeInAssignment method.
     */
	@Test
    public void testWrittenByYourself() {
        // Test case where code is written by yourself
        assertTrue(RulesOf6005.mayUseCodeInAssignment(true, false, false, false, false));
    }

    @Test
    public void testWrittenAsCourseWork() {
        // Test case where code is written as coursework
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, false, true, false, false));
    }

    @Test
    public void testAvailableToOthersAndCitingSource() {
        // Test case where code is available to others and citing the source is true
        assertTrue(RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
    }
    
    public void testAvailableToOthersWithoutCitingSource() {
        // Test case where code is available to others but the source is not cited
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
    }

}