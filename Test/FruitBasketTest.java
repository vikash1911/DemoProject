package com.fruit.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fruit.exception.EmptyBasketException;
import com.fruit.one.FruitBasket;
import com.fruit.one.FruitConstants;

public class FruitBasketTest {

	private HashMap<String, Integer> mapFruit=null;
	private FruitBasket fruitBasket = null;
	
		@Before  
	   public void setUp() throws Exception {
		
		mapFruit = new HashMap<String,Integer>();
		fruitBasket=new FruitBasket();
	    } 

	
		@Test
		public void testGetBasketValueWithAllFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.FRUIT_LEMON, 2);
			mapFruit.put(FruitConstants.FRUIT_BANANA, 1);
			mapFruit.put(FruitConstants.FRUIT_ORANGE,3);
			mapFruit.put(FruitConstants.FRUIT_APPLE,2);
			mapFruit.put(FruitConstants.FRUIT_PEACH, 5);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=119.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithFourFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.FRUIT_LEMON, 2);
			mapFruit.put(FruitConstants.FRUIT_BANANA, 5);
			mapFruit.put(FruitConstants.FRUIT_APPLE,2);
			mapFruit.put(FruitConstants.FRUIT_PEACH, 1);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=73.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithThreeFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.FRUIT_ORANGE,2);
			mapFruit.put(FruitConstants.FRUIT_APPLE,2);
			mapFruit.put(FruitConstants.FRUIT_PEACH,3);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=58.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithTwoFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.FRUIT_LEMON, 2);
			mapFruit.put(FruitConstants.FRUIT_BANANA, 4);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=36.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithOneFruit() throws EmptyBasketException {
			
			mapFruit.put(FruitConstants.FRUIT_PEACH, 3);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=36.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
	
		
		@Test(expected=EmptyBasketException.class)
		public void testGetBasketValueWithNoFruit() throws EmptyBasketException {
			
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=0.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithNegativeValue() throws EmptyBasketException {
			
			mapFruit.put(FruitConstants.FRUIT_LEMON, -2);
			mapFruit.put(FruitConstants.FRUIT_BANANA, -1);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=0.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@After
		public void tearDown() throws Exception {  
			mapFruit=null;  
			fruitBasket=null;
		} 


}
