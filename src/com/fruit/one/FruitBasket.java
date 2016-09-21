package com.fruit.one;

import java.util.HashMap;
import java.util.Map.Entry;

import com.fruit.exception.EmptyBasketException;

public class FruitBasket {

	
	
	/**
	* The method calculates the total value of fruit basket.
	* The price of each fruit is taken from constants file.
	*
	* @author  Vikram Banga
	* @version 1.0
	* @param basket A map containing key as fruit and value as quantity
	* @return float Returns the total value of basket.
	*/
	public float getBasketValue(HashMap<String,Float> basket) throws EmptyBasketException{
		
		float totalCostOfBucket=0f;
		
		if(basket!=null && basket.size()>0){
			try{
				float priceOfFruit=0f;
				for(Entry<String, Float> e: basket.entrySet()){
					if(e.getKey()!=null && e.getKey().equals(FruitConstants.FRUIT_BANANA)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.BANANA_PRICE_PER_DOZEN*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.FRUIT_APPLE)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.APPLE_PRICE_PER_KILO*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.FRUIT_LEMON)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.LEMON_PRICE_PER_KILO*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;	
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.FRUIT_ORANGE)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.ORANGE_PRICE_PER_KILO*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.FRUIT_PEACH)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.PEACH_PRICE_PER_KILO*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					
				}
				
			}catch(Exception e){
				System.out.println("improve");
				e.printStackTrace();
			}
			return totalCostOfBucket;
		}
		else{
			throw new EmptyBasketException("No Fruit present");
		}
	
		
		
	}

}
