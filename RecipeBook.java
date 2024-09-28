public class RecipeBook {
    private Recipe[] recipes;
    private int recipeCount;

    // Default constructor
    public RecipeBook() {
        this.recipes = new Recipe[100]; // Default capacity
        this.recipeCount = 0;
    }

    // Parameterized constructor
    public RecipeBook(int capacity) {
        this.recipes = new Recipe[capacity];
        this.recipeCount = 0;
    }

    // Add a recipe to the book
    public void addRecipe(Recipe recipe) {
        if (recipeCount < recipes.length) {
            recipes[recipeCount++] = recipe;
        } else {
            System.out.println("Recipe book is full.");
        }
    }

    // Remove a recipe by name
    public void removeRecipe(String recipeName) {
        for (int i = 0; i < recipeCount; i++) {
            if (recipes[i].getName().equalsIgnoreCase(recipeName)) {
                // Shift remaining recipes to the left
                for (int j = i; j < recipeCount - 1; j++) {
                    recipes[j] = recipes[j + 1];
                }
                recipes[--recipeCount] = null;
                System.out.println("Recipe removed: " + recipeName);
                return;
            }
        }
        System.out.println("Recipe not found: " + recipeName);
    }

    // Find a recipe by name
    public Recipe findRecipe(String recipeName) {
        for (int i = 0; i < recipeCount; i++) {
            if (recipes[i].getName().equalsIgnoreCase(recipeName)) {
                return recipes[i];
            }
        }
        return null;
    }

    // Print a specific recipe
    public void printRecipe(Recipe recipe) {
        if (recipe != null) {
            System.out.println(recipe);
        } else {
            System.out.println("Recipe not found.");
        }
    }

    // Print all recipes
    public void printAllRecipes() {
        if (recipeCount == 0) {
            System.out.println("No recipes in the book.");
        } else {
            for (int i = 0; i < recipeCount; i++) {
                System.out.println(recipes[i]);
            }
        }
    }
}
