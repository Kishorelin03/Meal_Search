import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MealSearch tracker = new MealSearch();
        String csvFile = "C:\\Users\\Smile\\eclipse-workspace\\seleniumWorkspace\\Meal_Search\\src\\meals.csv";  // Update this path to your CSV file
        tracker.loadCSVData(csvFile);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n✨ Welcome to the Meal Search Application! ✨\n");

        while (true) {
            System.out.print("🔍 Enter a meal to search or 'exit' to quit, 'popular' to see popular meals: ");
            String query = scanner.nextLine().trim();

            if (query.equalsIgnoreCase("exit")) {
                System.out.println("👋 Thank you for using the Meal Search Application!");
                break;
            }

            if (query.equalsIgnoreCase("popular")) {
                tracker.displayPopularMeals();
            } else {
                tracker.searchMeal(query);
            }
        }

        scanner.close();
    }
}


     

