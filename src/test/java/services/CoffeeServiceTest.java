package services;

import models.Coffee;
//import org.graalvm.compiler.debug.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class CoffeeServiceTest {

    @Test
    public void createTest() {
        //Given
        //int expectedId = 5;
        String expectedRoast = "medium";
        double expectedPrice = 9.99;
        String expectedCountry = "Colombia";
        int expectedQuantity = 2;
        CoffeeService coffeeService = new CoffeeService();
        Coffee testCoffee = coffeeService.create(expectedRoast, expectedPrice, expectedCountry, expectedQuantity);
        //When
        int actualID = testCoffee.getId();
        String actualRoast = testCoffee.getRoast();
        double actualPrice = testCoffee.getPrice();
        String actualCountry = testCoffee.getCountry();
        int actualQuantity = testCoffee.getQuantity();
        //Then
        Assert.assertEquals(Integer.class.getName(), Integer.valueOf(actualID).getClass().getName());
        Assert.assertEquals(expectedRoast, actualRoast);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedCountry, actualCountry);
        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void findCoffeeTest(){
        //Given
        String expectedRoast = "medium";
        double expectedPrice = 9.99;
        String expectedCountry = "Colombia";
        int expectedQuantity = 2;
        CoffeeService coffeeService = new CoffeeService();
        Coffee testCoffee = coffeeService.create(expectedRoast, expectedPrice, expectedCountry, expectedQuantity);
        //When

        //Then
        Assert.assertEquals(testCoffee, coffeeService.findCoffee(testCoffee.getId()));
    }

    @Test
    public void findAllTest(){
        //Given
        String expectedRoast = "medium";
        double expectedPrice = 9.99;
        String expectedCountry = "Colombia";
        int expectedQuantity = 2;
        CoffeeService coffeeService = new CoffeeService();
        Coffee testCoffee = coffeeService.create(expectedRoast, expectedPrice, expectedCountry, expectedQuantity);

        String expectedRoast1 = "dark";
        double expectedPrice1 = 11.99;
        String expectedCountry1 = "Brazil";
        int expectedQuantity1 = 4;
        //CoffeeService coffeeService1 = new CoffeeService();
        Coffee testCoffee1 = coffeeService.create(expectedRoast1, expectedPrice1, expectedCountry1, expectedQuantity1);
        //When

        //Then
        Assert.assertEquals(2, coffeeService.findAll().length);
    }

    @Test
    public void deleteTest(){
        //Given
        String expectedRoast = "medium";
        double expectedPrice = 9.99;
        String expectedCountry = "Colombia";
        int expectedQuantity = 2;
        CoffeeService coffeeService = new CoffeeService();
        Coffee testCoffee = coffeeService.create(expectedRoast, expectedPrice, expectedCountry, expectedQuantity);

        String expectedRoast1 = "dark";
        double expectedPrice1 = 11.99;
        String expectedCountry1 = "Brazil";
        int expectedQuantity1 = 4;
        //CoffeeService coffeeService1 = new CoffeeService();
        Coffee testCoffee1 = coffeeService.create(expectedRoast1, expectedPrice1, expectedCountry1, expectedQuantity1);
        //When
        int coffeeID = testCoffee.getId();
        //Then
        Assert.assertTrue(coffeeService.delete(coffeeID));
        Assert.assertFalse(coffeeService.delete(1021));
    }
}
