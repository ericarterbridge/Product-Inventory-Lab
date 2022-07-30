package models;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CroissantTest {

    @Test
    public void setIdTest(){
        //Given
        int expected = 2;
        //When
        Croissant croissant = new Croissant(0, null, 0, 0);
        croissant.setId(expected);
        //Then
        Assert.assertEquals(expected, croissant.getId());
    }

    @Test
    public void setTypeTest(){
        //Given
        String expected = "Almond";
        //When
        Croissant croissant = new Croissant(0, null, 0, 0);
        croissant.setType(expected);
        //Then
        Assert.assertEquals(expected, croissant.getType());
    }

    @Test
    public void setPriceTest(){
        //Given
        double expected = 2.99;
        //When
        Croissant croissant = new Croissant(0, null, 0, 0);
        croissant.setPrice(expected);
        //Then
        Assert.assertEquals(expected, croissant.getPrice());
    }

    @Test
    public void setQuantityTest(){
        //Given
        int expected = 10;
        //When
        Croissant croissant = new Croissant(0, null, 0, 0);
        croissant.setQuantity(expected);
        //Then
        Assert.assertEquals(expected, croissant.getQuantity());
    }

    @Test
    public void constructorTest(){
        //Given
        int expectedID = 2;
        String expectedType = "Chocolate";
        double expectedPrice = 1.99;
        int expectedQuantity = 10;
        //When
        Croissant croissant = new Croissant(expectedID, expectedType, expectedPrice, expectedQuantity);
        //Then
        Assert.assertEquals(expectedID, croissant.getId());
        Assert.assertEquals(expectedType, croissant.getType());
        Assert.assertEquals(expectedPrice, croissant.getPrice());
        Assert.assertEquals(expectedQuantity, croissant.getQuantity());
    }
}
