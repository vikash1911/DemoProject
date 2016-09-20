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

	private HashMap<String, Float> mapFruit=null;
	private FruitBasket fruitBasket = null;
	
		@Before  
	   public void setUp() throws Exception {
		
		mapFruit = new HashMap<String,Float>();
		fruitBasket=new FruitBasket();
	    } 

	
		@Test
		public void testGetBasketValueWithAllFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.fruitLemon, 2f);
			mapFruit.put(FruitConstants.fruitBanana, 1.5f);
			mapFruit.put(FruitConstants.fruitOrange,1.0f);
			mapFruit.put(FruitConstants.fruitApple,2.5f);
			mapFruit.put(FruitConstants.fruitPeach, 0.5f);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=945.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithFourFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.fruitLemon, 2f);
			mapFruit.put(FruitConstants.fruitBanana, 1.5f);
			mapFruit.put(FruitConstants.fruitApple,2.5f);
			mapFruit.put(FruitConstants.fruitPeach, 0.5f);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=885.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithThreeFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.fruitOrange,-1.0f);
			mapFruit.put(FruitConstants.fruitApple,2.5f);
			mapFruit.put(FruitConstants.fruitPeach, 0.5f);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=510.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithTwoFruits() throws EmptyBasketException {
			mapFruit.put(FruitConstants.fruitLemon, 2f);
			mapFruit.put(FruitConstants.fruitBanana, 1.5f);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=375.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
		
		@Test
		public void testGetBasketValueWithOneFruit() throws EmptyBasketException {
			
			mapFruit.put(FruitConstants.fruitPeach, 1.5f);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=180.0f;

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
		
		@After
		public void tearDown() throws Exception {  
			mapFruit=null;  
			fruitBasket=null;
		} 


}
