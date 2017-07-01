package com.mindtree.sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SampleTest {

    @Test
    public final void test() {
        assertEquals("This is ok", Sample.write(), "This is a sample project");
    }
}
