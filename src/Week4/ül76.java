package Week4;

import java.util.ArrayList;

public class ül76 {

    private ArrayList<String> meals;

    public ül76() {
        this.meals = new ArrayList<String>();
    }
    // implement methods here

    public void addMeal(String meal) {		// 76.1
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {			// 76.2
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {			// 76.3
        meals.clear();
    }

}