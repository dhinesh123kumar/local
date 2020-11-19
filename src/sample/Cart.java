package sample;
import java.util.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Cart {

	// showCatalog - should list all the price plans available. (prepare a
	// sample/dummy data)

	// showCart - should list the items added in cart - with amount(unitPrice *
	// quantity), if possible print the order amount

	// addToCart - should allow me to add the PricePlan to the cart. with
	// quantity

	// removeFromCart

	// Nov 11 - prepare dummy price plan data and list,add,modify.
	public static void main(String arg[]) {
		List<String> list = new ArrayList<String>();
		list.add("wiredheadphones");
		list.add("wirelessheadphones");
		list.add("bluetoohheadphones");
		PricePlan pp = new PricePlan(0, "Boat_Rockers255", new BigDecimal(
				500.00), list);
		PricePlan pp1 = new PricePlan(1, "Boat_Rockers255", new BigDecimal(
				500.00), list);
		PricePlan pp2 = new PricePlan(2, "Boat_400", new BigDecimal(6000.00),
				list);
		PricePlan pp3 = new PricePlan(3, "Boat_125", new BigDecimal(7000.00),
				list);
		PricePlan pp4 = new PricePlan(16, "Boat_255", new BigDecimal(8000.00),
				list);
		PricePlan pp5 = new PricePlan(17, "MI_123", new BigDecimal(908.00),
				list);
		PricePlan pp6 = new PricePlan(18, "Mi_627", new BigDecimal(100.00),
				list);
		PricePlan pp7 = new PricePlan(19, "Mi_345", new BigDecimal(3000.00),
				list);
		PricePlan pp8 = new PricePlan(20, "samsungA13",
				new BigDecimal(52300.00), list);
		PricePlan pp9 = new PricePlan(21, "samsungb12", new BigDecimal(500.00),
				list);
		PricePlan pp10 = new PricePlan(22, "samsung234",
				new BigDecimal(5009.00), list);
	/*	List<PricePlan> objlst = new ArrayList<PricePlan>();
		  objlst.add(pp);
		  objlst.add(pp1); objlst.add(pp2); objlst.add(pp3); objlst.add(pp4);
		  objlst.add(pp5); objlst.add(pp6); objlst.add(pp7); objlst.add(pp8);
		  objlst.add(pp9); objlst.add(pp10); 
		  //System.out.print(objlst.get(0));
		*/ 
		Map<String, PricePlan> hmobj = new HashMap<String, PricePlan>();
		hmobj.put("Boat_Rockers255", pp);
		hmobj.put("Boat_400", pp1);
		hmobj.put("Boat_400", pp2);
		hmobj.put("Boat_125", pp3);
		hmobj.put("Boat 255", pp4);
		hmobj.put("MI_123", pp5);
		hmobj.put("Mi_627", pp6);
		hmobj.put("Mi_345", pp7);
		hmobj.put("samsungA13", pp8);
		hmobj.put("samsungb12", pp9);
		hmobj.put("samsung234", pp10);
		// METHOD CALL 
	Priceplanview pricePlanView=new Priceplanview();
		   pricePlanView.showCatalouge(hmobj);
		   //System.out.println("This is the added items");
		   System.out.println("Enter the price plan you want to add cart:");
			Scanner sc=new Scanner(System.in);
			String pricePlanName=sc.next();
		   pricePlanView.addToCart(hmobj, pricePlanName);
	
	/*Priceplanlistview pricePlanlistView=new Priceplanlistview();
	System.out.println("This is the catalogue");
	pricePlanlistView.showCatalouge(objlst);
	
	System.out.println("Enter the value to add to cart");
	Scanner sc=new Scanner(System.in);
	int itemCode=sc.nextInt();
	List<PricePlan> addedcartlst=pricePlanlistView.addToCart(objlst,itemCode );
	System.out.println("Items added in Cart");
	pricePlanlistView.showCart(addedcartlst);
*/		  }
}
