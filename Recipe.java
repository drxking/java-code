public class Recipe {
    private String name;
    private Ingredient[] ingredients;
    private String[] instructions;

    // Default constructor
    public Recipe() {
        this.name = "Unknown";
        this.ingredients = new Ingredient[0];
        this.instructions = new String[0];
    }

    // Parameterized constructor
    public Recipe(String name, Ingredient[] ingredients, String[] instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }

    // Method to display recipe details
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append("Recipe Name: ").append(name).append("\nIngredients:\n");
        for (Ingredient ingredient : ingredients) {
            details.append("- ").append(ingredient).append("\n");
        }
        details.append("Instructions:\n");
        for (String instruction : instructions) {
            details.append("- ").append(instruction).append("\n");
        }
        return details.toString();
    }
}
