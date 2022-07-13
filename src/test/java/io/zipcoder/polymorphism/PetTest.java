package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testTestGetName() {
        String expected = "Benny";
        Pet doggo = new Dog(expected);
        String actual = doggo.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestSetName() {
        String expected = "Benny";
        Pet doggo = new Dog(expected);
        doggo.setName("Louis");
        String actual = doggo.getName();
        Assert.assertNotEquals(expected, actual);
        Assert.assertEquals("Louis", actual);
    }

    @Test
    public void testSpeak() {
        String name = "Benny";
        Pet doggo = new Dog(name);
        String expected = "Woof!";

        String actual = doggo.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestToString() {
        String name = "Benny";
        Pet doggo = new Dog(name);
        String actual = doggo.toString();
        String expected = "\nBenny says Woof!";

        Assert.assertEquals(expected, actual);
    }
}