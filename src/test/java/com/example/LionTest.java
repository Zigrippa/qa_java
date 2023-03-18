package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import java.util.Optional;

@RunWith(Parameterized.class)
public class LionTest extends TestCase {

    private final String sex;
    private final Boolean hasMane;

    public LionTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLions() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Иной", null},
        };
    }

    @Test
    public void testGetKittens() {
        try {
            int lionKittens = new Lion(sex, new Feline()).getKittens();
            assertEquals("Неверное число котят", Optional.of(lionKittens), Optional.of(1));
        } catch(Exception e) {
            System.out.println("Недопустимое значение пола");
        }
    }

    @Test
    public void testDoesHaveMane() {
        try {
            boolean lionHasMane = new Lion(sex, new Feline()).doesHaveMane();
            assertEquals("Не совпадает наличие/отсутствие гривы", Optional.of(lionHasMane), Optional.of(hasMane));
        } catch(Exception e) {
            System.out.println("Недопустимое значение пола");
        }
    }

    @Test
    public void testGetFood() {
        try {
            List<String> lionFood = new Lion(sex, new Feline()).getFood();
            assertEquals("Не совпадает наличие/отсутствие гривы", lionFood, List.of("Животные", "Птицы", "Рыба"));
        } catch(Exception e) {
            System.out.println("Недопустимое значение пола");
        }
    }
}