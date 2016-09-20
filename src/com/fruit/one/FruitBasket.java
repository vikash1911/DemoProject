package com.fruit.one;

import java.util.HashMap;
import java.util.Map;
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
					if(e.getKey()!=null && e.getKey().equals(FruitConstants.fruitBanana)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.bananaPriceForDozen*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.fruitApple)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.applePriceForKilo*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.fruitLemon)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.lemonPriceForKilo*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;	
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.fruitOrange)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.orangePriceForKilo*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
						}
					}
					else if(e.getKey()!=null && e.getKey().equals(FruitConstants.fruitPeach)){
						if(e.getValue()!=null && e.getValue()>0){
							priceOfFruit=FruitConstants.peachPriceForKilo*e.getValue();
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
