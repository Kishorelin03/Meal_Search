public class Meal {
    String website;
    String name_of_meal;
    String nutrition_values;
    String prepTime;
    String attributes;
    String allergens;
    String ingredients;
    String description;

    public Meal(String website, String name_of_meal, String nutrition_values, String prepTime, String attributes, String allergens, String ingredients, String description) {
        this.website = website;
        this.name_of_meal = name_of_meal;
        this.nutrition_values = nutrition_values;
        this.prepTime = prepTime;
        this.attributes = attributes;
        this.allergens = allergens;
        this.ingredients = ingredients;
        this.description = description;
    }
}
