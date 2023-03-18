package com.example;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest  {

    @Test
    public void testGetSound() {
        Cat cat = new Cat(new Feline());
        assertEquals("Звук не совпадает","Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(new Feline());
        assertEquals("Список еды не совпадает", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
