package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Priceplanview {
//Show catalog method
	public void showCatalouge(Map<String, PricePlan> hmobj) {
		System.out.println("THIS IS  CATALOGUE PAGE");
		/*Iterator<Map.Entry<String, Object>> itr = hmobj.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Object> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
			System.out.println();
	*/
		for (Map.Entry<String,PricePlan> entry : hmobj.entrySet()) {
		   // String key = entry.getKey();
		    //System.out.println(key);
		    
		    System.out.println(entry.getValue());
		}
		}

	
	
// add to catalog
	public void addToCart(Map<String, PricePlan> hmobj,String pricePlanName) {
		Map<String, PricePlan> pricePlanCart = new HashMap<String, PricePlan>();
		if(hmobj.containsKey(pricePlanName)) {
		for (Map.Entry<String,PricePlan> entry : hmobj.entrySet()) {
		    
		    
		    if(pricePlanName.equals(entry.getKey()))
		    {
		    	pricePlanCart.put(pricePlanName,entry.getValue() );
		    	
		    }
		}
		}else {
			System.out.println("This item Not available on the cart");
		}   
		    
 for (Map.Entry<String,PricePlan> entry : pricePlanCart.entrySet()) {
    String key = entry.getKey();
    System.out.println(key);
    Object value = entry.getValue();
    System.out.println(value);
}

	}	        
	
	/*public void showCart(Map<String, Object> pricePlanCart)
	{
		Iterator<Map.Entry<String, Object>> itr = pricePlanCart.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Object> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());

			}

*/
}
