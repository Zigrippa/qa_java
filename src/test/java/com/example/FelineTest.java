package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    @Mock
    Feline mock;

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        mock.eatMeat();
        Mockito.verify(mock, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testGetFoodInEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void testGetKittensWithoutParameter() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithParameter() {
        assertEquals(3, feline.getKittens(3));
    }
}