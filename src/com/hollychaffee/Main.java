package com.hollychaffee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "Eggs");
        meals.put(LUNCH, "Chicken salad");
        meals.put(DINNER, "Sushi");

        System.out.println(meals.get(DINNER));

        String lunch = meals.remove(LUNCH);
        boolean hasLunch = meals.containsKey(LUNCH);
        boolean hasChickenSalad = meals.containsValue("Chicken salad");
        int size = meals.size();

        System.out.println(LUNCH + " " + hasLunch + " " + hasChickenSalad + " " + size);


    }
}
