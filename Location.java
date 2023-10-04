import java.util.ArrayList;

public class Location {
    // Member variables
    private String name;
    private String description;
    private ArrayList<Item> itemList;
    
    // Constuctors
    public Location (String name, String description) {
        this.name = name;
        this.description = description;
        itemList = new ArrayList<Item>();
    }

    // Methods
    public void addItem(Item item) {
        itemList.add(item);
    }

    public boolean hasItem(String itemName) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().compareToIgnoreCase(itemName) == 0) {
                return true;
            }
        }
        return false;
    }

    public Item getItem (int index) {
        return itemList.get(index);
    }

    public Item getItem (String itemName) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().compareToIgnoreCase(itemName) == 0) {
                return itemList.get(i);
            }
        }
        return null;
    }

    public Item removeItem(String itemName) {
        for (int i = 0; i < itemList.size(); i ++) {
            if (itemList.get(i).getName().compareToIgnoreCase(itemName) == 0) {
                Item clone = new Item(itemList.get(i));
                itemList.remove(i);
                return clone;
            }
        }
        return null;
    }

    public int numItems () {
        return itemList.size();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
