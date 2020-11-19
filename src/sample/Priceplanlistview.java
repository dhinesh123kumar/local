package sample;

import java.util.ArrayList;
import java.util.List;



public class Priceplanlistview extends Cart {
	
	public void showCatalouge(List<PricePlan> list) {
		for (PricePlan i:list) {
			System.out.println(i);
			System.out.println();

	}
	}
// add to cart
	public List<PricePlan>  addToCart(List<PricePlan> list,int itemValue) {
		 List<PricePlan> objlst = new ArrayList<PricePlan>();
		 objlst.add(list.get(itemValue));
		 return objlst;
		
    }
	//show cart method
	public void showCart(List<PricePlan> addedcartlst)
	{
		for (PricePlan addedcartitems:addedcartlst) {
			System.out.println(addedcartitems);        
    } 	
    }
}



