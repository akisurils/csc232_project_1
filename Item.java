public class Item {
    // Member variables
    private String name;
    private ItemType type;
    private String description;

    // Constructors
    public Item (String name, ItemType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Item (Item item) {
        this.name = String.valueOf(item.name);
        this.type = item.type;
        this.description = String.valueOf(item.description);
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        StringBuilder result = new StringBuilder(name);
        result.append(" ");
        result.append(type.toString());
        result.append(" ");
        result.append(description);
        return result.toString();
    }
}
