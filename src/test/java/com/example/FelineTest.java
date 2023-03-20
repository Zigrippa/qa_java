package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {


    Feline feline = new Feline();

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