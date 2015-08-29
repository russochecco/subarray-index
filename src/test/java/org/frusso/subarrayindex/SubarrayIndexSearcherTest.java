package org.frusso.subarrayindex;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

public class SubarrayIndexSearcherTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private static final int NOT_FOUND = -1;

    @Test
    public void testFindIndexNullPointerException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Invalid arrays");
        SubarrayIndexSearcher.findIndex(null, new int[]{});
    }

    @Test
    public void testFindIndexInvalidParameterException() {
        expectedException.expect(InvalidParameterException.class);
        expectedException.expectMessage("Invalid arrays");
        SubarrayIndexSearcher.findIndex(new int[]{}, new int[]{});
    }

    @Test
    public void testFindIndexChildGreaterThanParent() {
        expectedException.expect(InvalidParameterException.class);
        expectedException.expectMessage("Second array is greater than first");
        SubarrayIndexSearcher.findIndex(new int[]{1}, new int[]{1, 2, 3});
    }

    @Test
    public void testFindIndex() {
        final int[] parent = new int[]{1, 4, 7, 9, 11, 3, 6, 5, 6, 2, 1, 6, 4};
        assertEquals(0, SubarrayIndexSearcher.findIndex(parent, parent));

        int[] child = new int[]{1, 6, 4, 3};
        assertEquals(NOT_FOUND, SubarrayIndexSearcher.findIndex(parent, child));

        child = new int[]{11, 6, 4, 3};
        assertEquals(NOT_FOUND, SubarrayIndexSearcher.findIndex(parent, child));

        child = new int[]{1, 6, 4};
        assertEquals(10, SubarrayIndexSearcher.findIndex(parent, child));

        child = new int[]{6, 4};
        assertEquals(11, SubarrayIndexSearcher.findIndex(parent, child));
    }
}