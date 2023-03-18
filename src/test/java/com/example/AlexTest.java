package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AlexTest {

    Alex alex = new Alex(new Feline());

    public AlexTest() throws Exception {
    }

    @Test
    public void testGetFriends() {
        assertEquals("Друзья не совпадают", List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман")
                , alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() {
        assertEquals("Место жительства не совпадает", "Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        assertEquals("Количество котят не совпадает", 0, alex.getKittens());
    }

}