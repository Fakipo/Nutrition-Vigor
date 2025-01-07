package nutrition.vigor.foodandhealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nutrition.vigor.foodandhealth.beans.FoodItem;
import nutrition.vigor.foodandhealth.service.FoodNutritionService;
import nutrition.vigor.foodandhealth.service.FoodNutritionServiceImpl;


@RestController
public class NutritionController {
	
	
	@Autowired
	FoodNutritionService foodNutritionService;
	
	@GetMapping("/")
	public String hi() {
		return "h1";
	}

	
	@GetMapping("/getDishNutrients")
	public FoodItem getDishNutrients(String foodItem) {
		FoodItem n1 = new FoodItem();
		n1.setFoodItemName("jal jeera");
		System.out.println("we are here in controller");
		foodNutritionService.getNutritionOfItem(foodItem);
		return n1;
	}
}
