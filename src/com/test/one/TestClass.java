package com.test.one;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

	HashMap<String, Float> mapFruit=null;
	FruitBasket fruitBasket = null;
	
		@Before  
	   public void setUp() throws Exception {
		
		mapFruit = new HashMap<String,Float>();
		fruitBasket=new FruitBasket();
	    } 

	
		@Test
		public void testGetBasketValue() {
			mapFruit.put(FruitConstants.fruitLemon, 2f);
			mapFruit.put(FruitConstants.fruitBanana, 1.5f);
			mapFruit.put(FruitConstants.fruitOrange,-1.0f);
			mapFruit.put(FruitConstants.fruitApple,2.5f);
			mapFruit.put(FruitConstants.fruitPeach, 0.5f);
			 
			 float actualValue=fruitBasket.getBasketValue(mapFruit);
			 float expectedValue=885.0f;

			 assertNotNull(actualValue);
			 assertEquals(expectedValue, actualValue, 0);
		}
	
		@After
		public void tearDown() throws Exception {  
			mapFruit=null;  
			fruitBasket=null;
		} 


}
