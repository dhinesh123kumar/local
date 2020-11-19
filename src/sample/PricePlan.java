package sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PricePlan {
	private Integer itemCode;

	private String itemName;

	private BigDecimal itemAmount;

	private List<String> categories = new ArrayList<String>();
	 
	private int quantity;

	PricePlan() {

	}

	public PricePlan(Integer itemCode, String itemName, BigDecimal itemAmount,
			List<String> categories) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemAmount = itemAmount;

		this.categories = categories;

	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public Integer getItemCode() {
		return itemCode;
	}

	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(BigDecimal itemAmount) {
		this.itemAmount = itemAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "ItemCode =" + itemCode + "itemName=" + itemName
				+ ", itemAmount=" + itemAmount + ", categories=" + categories;
	}

}
