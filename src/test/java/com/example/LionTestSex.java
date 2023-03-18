package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Optional;

@RunWith(Parameterized.class)
public class LionTestSex extends TestCase {

    private final String sex;
    private final Boolean hasMane;

    public LionTestSex(String sex, Boolean hasMane) {
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
    public void testLions() throws Exception {
        try {
            boolean lionSex = new Lion(sex, new Feline()).doesHaveMane();
            assertEquals("Пол льва не совпадает", Optional.of(lionSex), Optional.of(hasMane));
        } catch(Exception e) {
            System.out.println("Недопустимое значение пола");
        }

    }

}