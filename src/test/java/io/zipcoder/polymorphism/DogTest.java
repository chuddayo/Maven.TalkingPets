package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class DogTest {
    @Test
    public void speakDogTest() {
        Dog doggo = new Dog("Doggo");
        String expected = "Woof!";

        String actual = doggo.speak();
        Assert.assertEquals(expected, actual);
    }
}
