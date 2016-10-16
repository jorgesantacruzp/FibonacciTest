package com.fibonacci.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class FibonacciTestApplicationTests {

    public static final int POSITIVE_NUMBER = 9;
    public static final int NEGATIVE_NUMBER = -2;
    private FibonacciTestApplication application;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        application = new FibonacciTestApplication();
    }

    @Test
    public void shouldPrintFibonacciSerie() {
        List<Integer> list = application.printFibonacciSerie(POSITIVE_NUMBER);
        assertThat(POSITIVE_NUMBER, is(list.size()));
    }

    @Test
    public void shouldThrowInvalidArgumentException() {
        expectedException.expect(IllegalArgumentException.class);
        List<Integer> list = application.printFibonacciSerie(NEGATIVE_NUMBER);
    }

}
