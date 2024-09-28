import java.util.Scanner;

public class RecipeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();

        while (true) {
            System.out.println("Recipe Manager:");
            System.out.println("1. Add a Recipe");
            System.out.println("2. Print All Recipes");
            System.out.println("3. Find and Print a Recipe");
            System.out.println("4. Remove a Recipe");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Adding a new recipe
                    System.out.print("Enter recipe name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter number of ingredients: ");
                    int numIngredients = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Ingredient[] ingredients = new Ingredient[numIngredients];
                    for (int i = 0; i < numIngredients; i++) {
                        System.out.print("Enter ingredient " + (i + 1) + " name: ");
                        String ingredientName = scanner.nextLine();
                        System.out.print("Enter ingredient " + (i + 1) + " quantity: ");
                        String quantity = scanner.nextLine();
                        ingredients[i] = new Ingredient(ingredientName, quantity);
                    }

                    System.out.print("Enter number of instructions: ");
                    int numInstructions = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    String[] instructions = new String[numInstructions];
                    for (int i = 0; i < numInstructions; i++) {
                        System.out.print("Enter instruction " + (i + 1) + ": ");
                        instructions[i] = scanner.nextLine();
                    }

                    Recipe recipe = new Recipe(name, ingredients, instructions);
                    recipeBook.addRecipe(recipe);
                    break;

                case 2:
                    // Print all recipes
                    recipeBook.printAllRecipes();
                    break;

                case 3:
                    // Find and print a specific recipe
                    System.out.print("Enter recipe name to find: ");
                    String recipeNameToFind = scanner.nextLine();
                    Recipe foundRecipe = recipeBook.findRecipe(recipeNameToFind);
                    recipeBook.printRecipe(foundRecipe);
                    break;

                case 4:
                    // Remove a recipe
                    System.out.print("Enter recipe name to remove: ");
                    String recipeNameToRemove = scanner.nextLine();
                    recipeBook.removeRecipe(recipeNameToRemove);
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}
