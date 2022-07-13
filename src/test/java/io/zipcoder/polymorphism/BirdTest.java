package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class BirdTest {
    @Test
    public void speakBirdTest() {
        Bird birdie = new Bird("Birdie");
        String expected = "Chirp!";

        String actual = birdie.speak();
        Assert.assertEquals(expected, actual);
    }
}
