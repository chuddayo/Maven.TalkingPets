package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class CatTest {
    @Test
    public void speakCatTest() {
        Cat kittie = new Cat("Kitty");
        String expected = "Meow!";

        String actual = kittie.speak();
        Assert.assertEquals(expected, actual);
    }
}
