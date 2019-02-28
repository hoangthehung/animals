package com.hunghoang.animals;

import com.hunghoang.animals.models.bird.Rooster;
import org.junit.jupiter.api.*;

import java.util.Locale;

public class LanguageTest extends AbstractTest {


    Rooster rooster;

    @BeforeEach
    public void init(){
        this.rooster= new Rooster();
    }


    @Test
    public void testEnglish(){
        rooster.sing();
        System.out.flush();
        String expected = "Cock-a-doodle-doo" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }


    @Test
    public void testFrench(){
        Locale.setDefault(Locale.FRENCH);
        rooster.sing();
        System.out.flush();
        String expected = "cocorico" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @AfterAll
    static void shutdown(){
        Locale.setDefault(Locale.ENGLISH);
    }


}
