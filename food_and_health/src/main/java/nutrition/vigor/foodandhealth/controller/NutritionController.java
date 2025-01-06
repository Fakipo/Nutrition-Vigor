package nutrition.vigor.foodandhealth.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nutrition.vigor.foodandhealth.beans.Nutrients;


@RestController
public class NutritionController {
	
	@GetMapping("/")
	public String hi() {
		return "h1";
	}
	
	@GetMapping("/getDishNutrients")
	public Nutrients getDishNutrients() {
		Nutrients n1 = new Nutrients();
		n1.setProtein(12);
		n1.setCalories(150);
		n1.setFibre(50);
		n1.setFat(2);
		return n1;
	}
}
