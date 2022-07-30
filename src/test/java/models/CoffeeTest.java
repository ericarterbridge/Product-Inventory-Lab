package models;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CoffeeTest {

    @Test
    public void setRoastTest(){
        //Given
        String expected = "Dark";
        //When
        Coffee testCoffee = new Coffee(0, null, 0, null, 0);
        testCoffee.setRoast(expected);
        //Then
        Assert.assertEquals(expected, testCoffee.getRoast());
    }

    @Test
    public void setIDTest(){
        //Given
        int expected = 1;
        //When
        Coffee testCoffee = new Coffee(0, null, 0, null, 0);
        testCoffee.setId(expected);
        //Then
        Assert.assertEquals(expected, testCoffee.getId());
    }

    @Test
    public void setPriceTest(){
        //Given
        double expected = 8.99;
        //When
        Coffee testCoffee = new Coffee(0, null, 0, null, 0);
        testCoffee.setPrice(expected);
        //Then
        Assert.assertEquals(expected, testCoffee.getPrice());
    }

    @Test
    public void setCountryTest(){
        //Given
        String expected = "Brazil";
        //When
        Coffee testCoffee = new Coffee(0, null, 0, null, 0);
        testCoffee.setCountry(expected);
        //Then
        Assert.assertEquals(expected, testCoffee.getCountry());
    }

    @Test
    public void setQuantityTest(){
        //Given
        int expected = 10;
        //When
        Coffee testCoffee = new Coffee(0, null, 0, null, 0);
        testCoffee.setQuantity(expected);
        //Then
        Assert.assertEquals(expected, testCoffee.getQuantity());
    }

    @Test
    public void constructorTest(){
        //Given
        int expectedId = 5;
        String expectedRoast = "medium";
        double expectedPrice = 9.99;
        String expectedCountry = "Colombia";
        int expectedQuantity = 2;
        //When
        Coffee coffee = new Coffee(expectedId, expectedRoast, expectedPrice, expectedCountry, expectedQuantity);
        //Then
        Assert.assertEquals(expectedId, coffee.getId());
        Assert.assertEquals(expectedRoast, coffee.getRoast());
        Assert.assertEquals(expectedPrice, coffee.getPrice());
        Assert.assertEquals(expectedCountry, coffee.getCountry());
        Assert.assertEquals(expectedQuantity, coffee.getQuantity());
    }
}
