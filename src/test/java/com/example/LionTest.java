package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline mock;

    @Test(expected = Exception.class)
    public void testLionWithBadValueGetException() throws Exception{
        Lion lion = new Lion("Иной", mock);
    }

}