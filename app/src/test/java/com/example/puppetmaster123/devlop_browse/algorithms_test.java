package com.example.puppetmaster123.devlop_browse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class algorithms_test
{
    @Test
    public void algorithms_test() throws Exception
    {
        Algorithms newAlgorithm = new Algorithms("newName", "NewCatagory");
        assertEquals(newAlgorithm.getName(), "newName");
        assertEquals(newAlgorithm.getCatagory(), "newCatagory");
        assertNotEquals(newAlgorithm.getName(), "name");
        assertNotEquals(newAlgorithm.getCatagory(), "name");
    }
}