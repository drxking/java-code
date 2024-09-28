public class Ingredient {
    private String name;
    private String quantity;

    // Default constructor
    public Ingredient() {
        this.name = "Unknown";
        this.quantity = "Unknown";
    }

    // Parameterized constructor
    public Ingredient(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    // Method to display ingredient details
    public String toString() {
        return name + " (" + quantity + ")";
    }
}
