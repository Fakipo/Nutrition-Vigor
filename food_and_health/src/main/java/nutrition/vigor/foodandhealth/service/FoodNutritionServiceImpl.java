package nutrition.vigor.foodandhealth.service;

import nutrition.vigor.foodandhealth.beans.FoodItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FoodNutritionServiceImpl implements FoodNutritionService {

    private static final String API_URL = "https://api.nal.usda.gov/fdc/v1/foods/search?api_key=tmwOVCeNjJZUvj0X5wg1dCvjaebPAMzQvUszQbR4&query=";

    @Override
    public void getNutritionOfItem(String item) {
        String urlString = API_URL + item;
        String jsonResponse = makeApiCall(urlString);
        System.out.println("we are ehere");
    }

    private String makeApiCall(String urlString) {
    	System.out.println("now here in food and nutrition");
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Get the response
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response.toString();
    }

    private void parseJsonToFoodItem(String jsonResponse) {
        System.out.println(jsonResponse);
    }
}
