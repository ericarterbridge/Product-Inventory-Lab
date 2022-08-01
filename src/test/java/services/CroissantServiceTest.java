package services;

import models.Croissant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CroissantServiceTest {

    @Test
    public void createTest(){
        //Given
        String expectedType = "Chocolate";
        double expectedPrice = 1.99;
        int expectedQuantity = 10;
        CroissantService croissantService = new CroissantService();
        Croissant testCroissant = croissantService.create(expectedType, expectedPrice, expectedQuantity);
        //When
        int actualID = testCroissant.getId();
        String actualType = testCroissant.getType();
        double actualPrice = testCroissant.getPrice();
        int actualQuantity = testCroissant.getQuantity();
        //Then
        Assert.assertEquals(Integer.class.getName(), Integer.valueOf(actualID).getClass().getName());
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void findCroissantTest(){
        //Given
        String expectedType = "Almond";
        double expectedPrice = 3.74;
        int expectedQuantity = 9;
        CroissantService croissantService = new CroissantService();
        Croissant testCroissant = croissantService.create(expectedType, expectedPrice, expectedQuantity);
        //When

        //Then
        Assert.assertEquals(testCroissant, croissantService.findCroissant(testCroissant.getId()));
    }

    @Test
    public void findAllTest(){
        //Given
        String expectedType = "Almond";
        double expectedPrice = 3.74;
        int expectedQuantity = 9;
        CroissantService croissantService = new CroissantService();
        Croissant testCroissant = croissantService.create(expectedType, expectedPrice, expectedQuantity);

        String expectedType1 = "Plain";
        double expectedPrice1 = 3.05;
        int expectedQuantity1 = 3;
        Croissant testCroissant1 = croissantService.create(expectedType1, expectedPrice1, expectedQuantity1);
        //When

        //Then
        Assert.assertEquals(2, croissantService.findAll().length);
    }

    @Test
    public void deleteTest(){
        //Given
        String expectedType = "Almond";
        double expectedPrice = 3.74;
        int expectedQuantity = 9;
        CroissantService croissantService = new CroissantService();
        Croissant testCroissant = croissantService.create(expectedType, expectedPrice, expectedQuantity);

        String expectedType1 = "Plain";
        double expectedPrice1 = 3.05;
        int expectedQuantity1 = 3;
        Croissant testCroissant1 = croissantService.create(expectedType1, expectedPrice1, expectedQuantity1);
        //When
        int croissantID = testCroissant.getId();
        //Then
        Assert.assertTrue(croissantService.delete(croissantID));
        Assert.assertFalse(croissantService.delete(1021));
    }
}
