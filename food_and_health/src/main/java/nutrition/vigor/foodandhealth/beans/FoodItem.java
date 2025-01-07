package nutrition.vigor.foodandhealth.beans;


public class FoodItem {
	
	Nutrients nutrients;
	String foodItemName;
	int foodItemAmount;
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	public String getFoodItemName() {
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	public int getFoodItemAmount() {
		return foodItemAmount;
	}
	public void setFoodItemAmount(int foodItemAmount) {
		this.foodItemAmount = foodItemAmount;
	}
	
	
	
}
